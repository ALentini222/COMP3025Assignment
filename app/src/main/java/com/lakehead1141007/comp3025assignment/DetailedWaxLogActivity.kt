package com.lakehead1141007.comp3025assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.google.firebase.auth.FirebaseAuth
import com.lakehead1141007.comp3025assignment.databinding.ActivityDetailedWaxLogBinding

class DetailedWaxLogActivity : AppCompatActivity(), ProjectAdapter.ProjectItemListener {
    private lateinit var binding : ActivityDetailedWaxLogBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedWaxLogBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel: ProjectViewModel by viewModels()
        viewModel.getProjects().observe(this, { projects ->
            binding.recyclerView.adapter = ProjectAdapter(this, projects, this)
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

    override fun projectSelected(project: Project) {
        var intent = Intent(this, DetailedWaxLogActivity::class.java)
        intent.putExtra("projectID", project.id)
        startActivity(intent)
    }
}