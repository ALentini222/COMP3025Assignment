package com.lakehead1141007.comp3025assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.lakehead1141007.comp3025assignment.databinding.ActivityWeatherButtonBinding

class WeatherButtonActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWeatherButtonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeatherButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onStart(){
        super.onStart()
    }
    override fun onResume(){
        super.onResume()
    }
    override fun onPause(){
        super.onPause()
    }
    override fun onStop(){
        super.onStop()
    }
    override fun onDestroy() {
        super.onDestroy()
    }
}