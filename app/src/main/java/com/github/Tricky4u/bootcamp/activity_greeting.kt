package com.github.Tricky4u.bootcamp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class activity_greeting : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        val intent = intent
        val value = intent.getStringExtra("NAME")
        val text = findViewById<TextView>(R.id.greetingText)
        text.text = "Hello " + value + "!"
    }
}