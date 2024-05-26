package com.example.minicalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class ThirdActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val buttonNewActivity = findViewById<Button>(R.id.btnBack)

        buttonNewActivity.setOnClickListener {
            finish()
        }

        val result = intent.getDoubleExtra("result", 0.0)
        //val StringResult = result.toString()
        val formattedResult = String.format("%.2f", result)

        val textViewResult = findViewById<TextView>(R.id.result)
        textViewResult.text = "$formattedResult"
    }
}