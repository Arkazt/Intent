package com.example.eventlistener

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BMI_Activity : AppCompatActivity() {
    //deklarasi dan relasi
    val edBerat: EditText = findViewById(R.id.edBerat)
    val edTinggi: EditText = findViewById(R.id.edTinggi)
    val btn: Button = findViewById(R.id.Button)
    val result: TextView = findViewById(textView4)
    val isiBerat: 

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bmi)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //menghubungkan variabel dengan id komponen pada XML layout


    }
}