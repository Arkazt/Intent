package com.example.eventlistener

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Listener1 : AppCompatActivity(), View.OnClickListener {
    //deklarasi variable I/O --> komponen (textView, EditText, Buttton, dsb)
    //Global variabel
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listener1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //hubungkan komponen XML Layout dengan variabel di file kotlin
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)

        //memasang event listener pada button
        //1. di dalam method onCreate
        btn1.setOnClickListener { //button klik
            //logic program disini >> menjalankan apa
            //Notifikasi (mirip dengan JOptionPane >> Android: Toast)
            Toast.makeText(this,"Tombol 1 sudah diklik", Toast.LENGTH_LONG).show()
        }

        //2. Menggunakan implements class View.OnClickListener
        //di dalam onCreate harus deklarasi setListener
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        //safe operator (?) >> aksesnya menggunakan when/if
        when (v?.id){//isi variabel v ini adalah id. onClick >> id >> button
            R.id.btn2 -> {
                Toast.makeText(this, "Tombol 2 sudah diklik", Toast.LENGTH_LONG).show()
            }

            R.id.btn3 -> {
                //menjalankan apa..
                Toast.makeText(this, "Tombol 3 sudah diklik", Toast.LENGTH_LONG).show()
            }

            R.id.btn4 -> {
                Toast.makeText(this, "Tombol 4 sudah diklik", Toast.LENGTH_LONG).show()
            }
        }
    }
}