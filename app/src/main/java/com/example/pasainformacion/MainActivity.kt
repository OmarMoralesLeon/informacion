package com.example.pasainformacion

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.pasainformacion.R.id.Regresar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(Regresar)
        val texName = findViewById<EditText>(R.id.texName)

        btnStart.setOnClickListener {
            val texSaludo = Bundle()
            texSaludo.putString("keyDatos", texName.text.toString())

            val intent = Intent(this@MainActivity, Ventana2::class.java)
            intent.putExtras(texSaludo)
            startActivity(intent)
        }
    }
}
