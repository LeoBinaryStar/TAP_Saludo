package com.example.holamundo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var nombre: EditText
    lateinit var ok: Button
    lateinit var saludo: TextView

    @SuppressLint("MissingInfLateId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombre = findViewById(R.id.Nombre)
        ok = findViewById(R.id.Saludar)
        saludo = findViewById(R.id.Mostrar)
    }

    // Definición de la función saludar
    fun construyeSaludo(v:View) {
        if (!nombre.text.toString().isEmpty()) {
            var construye = "Hola ☻ " + nombre.text.toString() + "¿Como estas?"
            saludo.text = construye
        } else {
            var alerta = AlertDialog.Builder(this)
                .setTitle("Error")
                .setMessage("No se ingreso ningun nombre")
            alerta.show()
        }
    }
    fun borrar(v:View){
        if(!saludo.text.toString().isEmpty()){
            nombre.setText("")
            saludo.text = ""
        } else {
            var alerta = AlertDialog.Builder(this)
                .setTitle("Error")
                .setMessage("No ha ingresdo un nombre")
            alerta.show()
        }
    }
}

