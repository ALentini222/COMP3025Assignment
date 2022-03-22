package com.lakehead1141007.comp3025assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakehead1141007.comp3025assignment.databinding.ActivityLogWaxBinding

class LogWaxActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLogWaxBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_wax)
    }
}