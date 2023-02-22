package com.github.Tricky4u.bootcamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.mainButton)
        buttonClick.setOnClickListener {
            val intent = Intent(this, activity_greeting::class.java)
            intent.putExtra("NAME", findViewById<EditText>(R.id.mainText).text.toString())
            startActivity(intent)
        }


    }
}