package com.lakehead1141007.comp3025assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.lakehead1141007.comp3025assignment.databinding.ActivityDetailedWaxLogBinding

class DetailedWaxLogActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailedWaxLogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedWaxLogBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel : ProjectViewModel by viewModels()
        viewModel.getProjects().observe(this, {
            for (project in it)
                Log.i("DB_Response","inside CreateProjectActivity, project: $project")
        })
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