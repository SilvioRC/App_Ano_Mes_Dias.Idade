package com.example.app_02_idade_em_dias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
//import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt_Ano = findViewById<EditText>(R.id.txt_Ano)
        val txt_Mes = findViewById<EditText>(R.id.txt_Mes)
        val txt_Dia = findViewById<EditText>(R.id.txt_Dia)
        val txt_AnoNascimento = findViewById<EditText>(R.id.txt_AnoNascimento)
        val txt_Resultado = findViewById<TextView>(R.id.txt_Resultado)
        val btn_Converter = findViewById<Button>(R.id.btn_Converter)
        val txt_Decada = findViewById<EditText>(R.id.txt_Decada)
        val btn_ConveterDecadas = findViewById<Button>(R.id.btn_ConverterDecadas)
        val txt_ResultadoDecadas = findViewById<TextView>(R.id.txt_ResultadoDecadas)

        btn_Converter.setOnClickListener {
            if (txt_Ano.text.isEmpty()) {
                txt_Ano.error = "Digite a quantidade de ano(s)"
            } else if (txt_Mes.text.isEmpty()) {
                txt_Mes.error = "Digite a quantidade de mes(es)"
            } else if (txt_Dia.text.isEmpty()) {
                txt_Dia.error = "Digite a quantidade dia(s)"
            } else {
                val ano = txt_Ano.text.toString().toInt()
                val mes = txt_Mes.text.toString().toInt()
                val dia = txt_Dia.text.toString().toInt()
                val resultado: Int
                resultado = ano * 360 + mes * 30 + dia
                txt_Resultado.text = "Você tem $resultado dia(s)"
            }
        }
        btn_ConveterDecadas.setOnClickListener {
            if (txt_Decada.text.isEmpty()) {
                txt_Decada.error = "Digite quantos anos você tem"
            } else {
                val anos = txt_Decada.text.toString().toInt()
                val AnoNascimento = txt_AnoNascimento.text.toString().toInt()
                val conversor: Int
                conversor = AnoNascimento - anos
                txt_ResultadoDecadas.text = "Você nasceu no ano de  $conversor"
            }
        }
    }
}



