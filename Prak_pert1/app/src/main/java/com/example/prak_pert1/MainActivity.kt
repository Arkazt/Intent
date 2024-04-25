package com.example.prak_pert1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtNIK = findViewById<EditText>(R.id.edtNIK)
        val edtNAMA = findViewById<EditText>(R.id.edtNAMA)
        val edtALAMAT = findViewById<EditText>(R.id.edtAlAMAT)
        val edtAGAMA = findViewById<EditText>(R.id.edtAGAMA)
        val btOK = findViewById<EditText>(R.id.btOK)

        btOK.setOnClickListener(View.OnClickListener {
            val nim = edtNIK.text.toString()
            val nama = edtNAMA.text.toString()
            val alamat = edtALAMAT.text.toString()
            val agama = edtAGAMA.text.toString()

            Toast.makeText(this, "NIM anda : " + nim + "\nNama anda : " + nama + "\nAlamat anda : " + alamat + "\nAgama anda : " + agama, Toast.LENGTH_LONG).show()
        })
    }
}