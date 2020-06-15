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

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, LanguageActivity::class.java)
            startActivity(intent)
        }
    }


}
