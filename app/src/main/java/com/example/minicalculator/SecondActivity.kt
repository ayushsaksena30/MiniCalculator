package com.example.minicalculator.ui.theme

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.minicalculator.R

class SecondActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnOpenActivity = findViewById<Button>(R.id.btnBack)  // Use findViewById

        btnOpenActivity.setOnClickListener {
            finish()
        }
    }
}