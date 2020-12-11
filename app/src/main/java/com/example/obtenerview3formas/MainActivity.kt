package com.example.obtenerview3formas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.obtenerview3formas.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //--FIND VIEW BY ID--
        val textView1 = findViewById<TextView>(R.id.tv1)
        /*val textView2 = findViewById<TextView>(R.id.tv2)
        val bot1 = findViewById<TextView>(R.id.b1)

        bot1.setOnClickListener {
            textView1.setText("Primera forma lograda!!")
        }*/

        //--VIEW BINDING--
        //Tras poner en el build.gradle (Module: app), en el apartado Android la siguiente
        //linea de codigo al final: viewBinding.enabled = true
        /*val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.b1.setOnClickListener {
            binding.tv1.text = "Segunda forma lograda!!"
        }*/

        //--IMPORTS SINTÉTICOS--
        b1.setOnClickListener {
            textView1.setText("Tercera forma lograda!!")
        }
    }
}