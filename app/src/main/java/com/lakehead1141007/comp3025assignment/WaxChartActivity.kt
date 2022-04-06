package com.lakehead1141007.comp3025assignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lakehead1141007.comp3025assignment.databinding.ActivityWaxChartBinding

class WaxChartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWaxChartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWaxChartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.gripButton.setOnClickListener{
            val intent = Intent(this, GripWaxChartActivity::class.java)
            startActivity(intent)
        }
    }
}

