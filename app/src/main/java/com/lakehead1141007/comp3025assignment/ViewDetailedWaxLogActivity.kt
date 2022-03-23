package com.lakehead1141007.comp3025assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import com.lakehead1141007.comp3025assignment.databinding.ActivityViewDetailedWaxLogBinding

class ViewDetailedWaxLogActivity : AppCompatActivity() {
    private lateinit var binding : ActivityViewDetailedWaxLogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewDetailedWaxLogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getStringExtra("id")
        val db = FirebaseFirestore.getInstance().collection("projects")
        var project = Project()

        db.whereEqualTo("id", id)
            .get()
            .addOnSuccessListener { querySnapShot ->
                for (document in querySnapShot) {
                    project = document.toObject(Project::class.java)
                    binding.textDate.text = project.date
                    binding.skiEntry.text = project.ski
                    binding.glideWaxEntry.text = project.glide
                    binding.gripWaxEntry.text = project.grip
                    binding.textComments.text = project.comments
                }
            }
        binding.backButton.setOnClickListener{
            val intent = Intent(this, DetailedWaxLogActivity::class.java)
            startActivity(intent)
        }
    }
}