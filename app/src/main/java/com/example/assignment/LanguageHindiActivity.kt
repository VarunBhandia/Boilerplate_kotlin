package com.example.assignment

//Library import section starts
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView

//Library import section ends

//Message displaying class for Hindi Language
class LanguageHindiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

//        Defining a variable to check whether the screen was loaded for the first time or not
        var firstRender = true

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_hindi)

//        Accessing a relative layout to dynamically display text.
        val layout = findViewById<RelativeLayout>(R.id.root)

        // Creating TextView dynamically.
        val textView = TextView(this)

//        Fetching the list of languages feeded in strings.xml
        val languages = resources.getStringArray(R.array.Languages)

//        Fetching the list of languages text feeded in strings.xml
        val languagesDetails = resources.getStringArray(R.array.languages_details)

        // Accessing the spinner
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {

            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_dropdown_item, languages
            )
            spinner.adapter = adapter

//            Handling a onclick event of dropdown
            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
//                    Condition to render text view according to language selected
                    if (firstRender == true) {
                        firstRender = false
                        textView.layoutParams = RelativeLayout.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT
                        )
                        // setting text
                        textView.setText(languagesDetails[1])
                        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25f)

                        layout?.addView(textView)
                    } else {
// Remove the current layout to add a new one
                        layout?.removeView(textView)
                        // setting height and width
                        textView.layoutParams = RelativeLayout.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT
                        )
                        // setting text
                        textView.setText(languagesDetails[position])
                        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25f)
//Adding a new layout
                        layout?.addView(textView)
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                }
            }
        }
    }
}
