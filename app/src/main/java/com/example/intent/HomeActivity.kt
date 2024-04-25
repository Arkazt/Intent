package com.example.intent

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //obj = String, Array, dst
        lateinit var edBerat: EditText
        lateinit var edTinggi: EditText
        lateinit var btn: Button

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        edBerat = findViewById(R.id.numberWeight)
        edTinggi = findViewById(R.id.numberHeight)
        btn = findViewById(R.id.btnCalculate)



        //set event listener
        btn.setOnClickListener {
            val isiBerat = edBerat.text.toString()
            val isiTinggi = edTinggi.text.toString()
            val result: TextView = findViewById(R.id.result)
            //convert ke float /double
            when {
                isiBerat.isNullOrEmpty() -> {
                    Toast.makeText(this,"Harus diisi", Toast.LENGTH_LONG)
                }
                isiTinggi.isNullOrEmpty() -> {
                    Toast.makeText(this, "Harus diisi", Toast.LENGTH_LONG)
                }
                else -> {
                    val hitungBMI = isiBerat.toFloat()/((isiTinggi
                        .toFloat()/100)
                            *(isiTinggi.toFloat()/100))
                    result.text = hitungBMI.toString()
                }

            }

        }
    }

//    private fun resutltBMI(bmi: Float){
//        val result: TextView = findViewById(R.id.result)
//        result.text = bmi.toString()
//        when{
//            bmi < 18.5 -> {
//                Toast.makeText(this,"UnderWeight")
//            }
//            bmi in 18.5 < .. < 24.9 -> {
//                Toast.makeText(this,"Healty",
//                Toast.LENGTH_LONG).show()
//
//            }
//        }
//    }
}