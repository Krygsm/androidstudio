package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)

        // Assuming you have a textView with id "textView" in your layout
        val textView: TextView = findViewById(R.id.textView)

        // Assuming you have three buttons with ids "button6", "button", and "button2" in your layout
        val button6: Button = findViewById(R.id.button6)
        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)

        // Set onClickListeners for each button to update the textView
        button6.setOnClickListener {
            textView.text = "Kliknales"
        }

        button.setOnClickListener {
            textView.text = "clicked"
        }

        button2.setOnClickListener {
            textView.text = "tromba"
        }
    }
}