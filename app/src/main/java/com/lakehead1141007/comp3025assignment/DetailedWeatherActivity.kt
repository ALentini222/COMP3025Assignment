package com.lakehead1141007.comp3025assignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lakehead1141007.comp3025assignment.databinding.ActivityDetailedWeatherBinding

class DetailedWeatherActivity: AppCompatActivity() {
    private lateinit var binding: ActivityDetailedWeatherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_weather)
    }
}