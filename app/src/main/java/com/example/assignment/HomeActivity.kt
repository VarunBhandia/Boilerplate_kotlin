package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        val button_english = findViewById<Button>(R.id.button_english)
        button_english.setOnClickListener{
            val intent = Intent(this, LanguageActivity::class.java)
            startActivity(intent)
        }

        val button_hindi = findViewById<Button>(R.id.button_hindi)
        button_hindi.setOnClickListener{
            val intent = Intent(this, LanguageHindiActivity::class.java)
            startActivity(intent)
        }

    }
}
