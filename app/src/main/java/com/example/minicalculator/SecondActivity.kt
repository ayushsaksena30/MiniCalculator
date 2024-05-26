package com.example.minicalculator.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.minicalculator.R
import com.example.minicalculator.ThirdActivity

class SecondActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnOpenActivity = findViewById<Button>(R.id.btnBack)
        val number1 = findViewById<TextView>(R.id.editTextNumber)
        val number2 = findViewById<TextView>(R.id.editTextNumber2)

        val radiogroup = findViewById<RadioGroup>(R.id.radioGroup)
        val btnNext = findViewById<Button>(R.id.btnNext)

        btnOpenActivity.setOnClickListener {
            finish()
        }

        btnNext.setOnClickListener {
            val num1 = number1.text.toString()
            val num2 = number2.text.toString()

            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val num1Int = num1.toDouble()
            val num2Int = num2.toDouble()

            var result = 0.0

            when (radiogroup.checkedRadioButtonId) {
                R.id.radioButton -> result = num1Int + num2Int
                R.id.radioButton2 -> result = num1Int - num2Int
                R.id.radioButton3 -> result = num1Int * num2Int
                R.id.radioButton4 -> {
                    if (num2Int != 0.0) {
                        result = num1Int / num2Int
                    } else {
                        Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                }
            }

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("result", result)
            startActivity(intent)
        }
    }
}