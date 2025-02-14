package com.example.mytestapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var a = findViewById<EditText>(R.id.editText1)
        var b = findViewById<EditText>(R.id.editText2)
        var knopka = findViewById<Button>(R.id.button)
        var knopkaclear = findViewById<Button>(R.id.buttonclear)
        var textik:TextView = findViewById(R.id.textView2)


        knopka.setOnClickListener {
            var a1 = a.text.toString().trim()
            var b1 = b.text.toString().trim()

            if (a1 == "" || b1 == "") {
                Toast.makeText(this, "Ошибка!", Toast.LENGTH_SHORT).show()          //ВСПЛЫВАЮЩЕЕ СООБЩЕНИЕ
            }
            else{
                var a11 = a1.toLong()
                var b11 = b1.toLong()
                var result = a11 + b11
                textik.text = "Результат: $result"
            }
        }

        knopkaclear.setOnClickListener {
            textik.text = "Результат: "
            a.text.clear()
            b.text.clear()
        }

    }
}