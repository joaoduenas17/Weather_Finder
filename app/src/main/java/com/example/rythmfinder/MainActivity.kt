package com.example.rythmfinder

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sendButton= findViewById<Button>(R.id.send)
        val grados= findViewById<TextView>(R.id.grados_text)
        //click para el boton
        sendButton.setOnClickListener{
            grados.setText("Grados: 27")
        }
        //para la imagen
        val imagenView:ImageView= findViewById(R.id.clima_imagen)
        imagenView.setImageResource(R.drawable.imagen_final)
    }
}

