package com.lakehead1141007.comp3025assignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lakehead1141007.comp3025assignment.databinding.ActivityDetailedWaxLogBinding

class DetailedWaxLogActivity: AppCompatActivity() {
    private lateinit var binding : ActivityDetailedWaxLogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detailed_wax_log)
    }
}