package com.joel.examenpmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var boton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 100 downTo 1){
            Log.i("Cuenta regresiva ", i.toString())
        }

        boton = findViewById(R.id.boton)

        boton.setOnClickListener {
            Toast.makeText(this, "Toast creada por el usuario", Toast.LENGTH_LONG).show()
        }
    }

    override fun onResume(){
        super.onResume()
        //Aqui escribiriamos el codigo que queremos ejecutar
        //mientras el usuario esta interactuando con la aplicación
    }
}