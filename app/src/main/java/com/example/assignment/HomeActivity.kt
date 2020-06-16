package com.example.assignment

//Library import section starts
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
//Library import section ends

// Main class that renders on opening the app
class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Rendering layout from xml file
        setContentView(R.layout.home_activity)

//        Button for diplaying message in English language
        val button_english = findViewById<Button>(R.id.button_english)
        button_english.setOnClickListener {
            val intent = Intent(this, LanguageActivity::class.java)
            startActivity(intent)
        }

//        Button for diplaying message in hindi language
        val button_hindi = findViewById<Button>(R.id.button_hindi)
        button_hindi.setOnClickListener {
            val intent = Intent(this, LanguageHindiActivity::class.java)
            startActivity(intent)
        }

    }
}
