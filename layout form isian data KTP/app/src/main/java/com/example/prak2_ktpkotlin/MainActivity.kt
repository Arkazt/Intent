package com.example.prak2_ktpkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edNama = findViewById<EditText>(R.id.edNama)
        val rb1 = findViewById<EditText>(R.id.rb1)
        val rb2 = findViewById<EditText>(R.id.rb2)
        val btn1 = findViewById<EditText>(R.id.btn1)

        btn1.setOnClickListener(View.OnClickListener {
            val nama =edNama.text.toString()

        })
    }
}