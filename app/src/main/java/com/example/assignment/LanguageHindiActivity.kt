package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView

class LanguageHindiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var firstRender = true
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_hindi)

        val layout = findViewById<RelativeLayout>(R.id.root)

        // Create TextView programmatically.
        val textView = TextView(this)

        val languages = resources.getStringArray(R.array.Languages)
        val languagesDetails = resources.getStringArray(R.array.languages_details)


        // access the spinner
        val spinner = findViewById<Spinner>(R.id.spinner)


        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item, languages
        )
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View, position: Int, id: Long
            ) {
                if (firstRender == true) {
                    firstRender = false
                    textView.layoutParams = RelativeLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
                    // setting text
                    textView.setText(languagesDetails[1])
                    textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f)

                    layout?.addView(textView)
                } else {
                    layout?.removeView(textView)
                    // setting height and width
                    textView.layoutParams = RelativeLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
                    // setting text
                    textView.setText(languagesDetails[position])
                    textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f)

                    layout?.addView(textView)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // write code to perform some action
            }
        }
    }
}

