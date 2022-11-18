package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nombre = findViewById<EditText>(R.id.username)
        var contrasena = findViewById<EditText>(R.id.password)
        var boton = findViewById<Button>(R.id.button)
        boton.setOnClickListener {
            Toast.makeText(this,"Esto es un aviso",Toast.LENGTH_SHORT).show()
        }
        nombre.addTextChangedListener{
            if (it?.length ?:0 > 10){
                nombre.setError("no escribir mas de 10 caracteres")
            }
        contrasena.addTextChangedListener{
            if (it?.length ?:0 < 4) {
                contrasena.setError("contraseña muy corta")
            }
        }
        }
    }
}
