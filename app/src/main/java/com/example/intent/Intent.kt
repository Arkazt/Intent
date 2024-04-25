package com.example.intent

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Intent : AppCompatActivity(), View.OnClickListener {

    lateinit var btnExplicit: Button
    lateinit var btnImplicit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnExplicit = findViewById(R.id.btnExplicit)
        btnImplicit = findViewById(R.id.btnImplicit)

        btnExplicit.setOnClickListener(this)
        btnImplicit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btnExplicit -> {
                //fungsi intent dijalankan (di dlm aksi button)
                val intenExplicit = Intent(this@Intent, PageActivity2::class.java)

                //run intent
                startActivity(intenExplicit)
            }

            R.id.btnImplicit -> {

            }
        }
    }
}