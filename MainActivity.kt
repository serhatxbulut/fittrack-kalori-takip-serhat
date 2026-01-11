package com.fittrack.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var txtTotalCalories: TextView
    private var totalCalories = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtTotalCalories = findViewById(R.id.txtTotalCalories)
        updateCalories(0)
    }

    private fun updateCalories(newCal: Int) {
        totalCalories += newCal
        txtTotalCalories.text = "Toplam Kalori: $totalCalories kcal"
    }
}
