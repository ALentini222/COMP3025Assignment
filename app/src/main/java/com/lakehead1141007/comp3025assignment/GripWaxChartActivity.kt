package com.lakehead1141007.comp3025assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakehead1141007.comp3025assignment.databinding.ActivityGripWaxChartBinding

class GripWaxChartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGripWaxChartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityGripWaxChartBinding.inflate(layoutInflater)
            setContentView(binding.root)
            binding.backButton.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        binding.gripButton.setOnClickListener{
            val intent = Intent(this,WaxChartActivity::class.java)
            startActivity(intent)
        }
        }
}