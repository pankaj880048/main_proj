package com.example.ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class Question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)
        val radiobutton1 = findViewById<RadioButton>(R.id.rb_radiobutton1)
        val radiobutton2 = findViewById<RadioButton>(R.id.rb_radiobutton2)
        val checkbox = findViewById<CheckBox>(R.id.cb_checkbox)

        radiobutton1.setOnClickListener {
            Toast.makeText(this,"Radiobutton 1 Selected", Toast.LENGTH_SHORT).show()
        }
        radiobutton2.setOnClickListener {
            Toast.makeText(this,"Radiobutton  2 Selected", Toast.LENGTH_SHORT).show()
        }
        checkbox.setOnClickListener {
            Toast.makeText(this,"Checkbox Selected", Toast.LENGTH_SHORT).show()
        }
    }
}