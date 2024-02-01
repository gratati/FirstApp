package com.example.firstapp

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var inputEditText: EditText
    private lateinit var resultTextView: TextView
    private lateinit var countTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Все наоборот"

        inputEditText = findViewById(R.id.editTextET)
        resultTextView = findViewById(R.id.textTV)
        countTextView = findViewById(R.id.countText)

        val convertButton: Button = findViewById(R.id.buttonBTN)
        convertButton.setOnClickListener {
            val inputText = inputEditText.text.toString()
            val reversedText = inputText.reversed()

            resultTextView.text = reversedText

            val count = inputText.replace(" ", "").length
            countTextView.text = "Количество символов: $count"

        }
    }
}
