package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.button)
        val boton2 = findViewById<Button>(R.id.button2)
        val boton3 = findViewById<Button>(R.id.button3)
        val boton4 = findViewById<Button>(R.id.button4)
        val texto = findViewById<TextView>(R.id.textView)

        boton.setOnClickListener{
            texto.visibility = TextView.INVISIBLE


        }
        boton2.setOnClickListener{
            texto.visibility = TextView.VISIBLE
        }


        boton3.setOnClickListener{
            texto.setTextColor(Color.BLUE)
        }

        boton4.setOnClickListener{
            texto.setTextColor(Color.GREEN)
        }

    }
}