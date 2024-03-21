package com.example.pasainformacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class Ventana2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)
        val tvDatos = findViewById<TextView>(R.id.texSaludo)

        val resiveDatos = intent.extras
        val info = resiveDatos?.getString("keyDatos")

        tvDatos.text = info

        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.activity_main)

        val Regresar: Button = findViewById(R.id.Regresar)
        Regresar.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}
