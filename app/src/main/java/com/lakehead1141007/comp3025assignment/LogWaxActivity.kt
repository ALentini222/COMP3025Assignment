package com.lakehead1141007.comp3025assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.lakehead1141007.comp3025assignment.databinding.ActivityLogWaxBinding
import com.google.firebase.firestore.FirebaseFirestore

class LogWaxActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLogWaxBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogWaxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener{
            var date = binding.editTextDate.text.toString().trim()
            var ski = binding.skiEntry.text.toString().trim()
            var glide = binding.glideWaxEntry.text.toString().trim()
            var grip = binding.gripWaxEntry.text.toString().trim()
            var comments = binding.editTextComments.text.toString().trim()
            if(date.isNotEmpty() && ski.isNotEmpty()){
                if(glide.isEmpty()){
                    glide = "None Used"
                }
                if(grip.isEmpty()){
                    grip = "None Used"
                }
                if(comments.isEmpty()){
                    comments = "None"
                }
                var project = Project(date, ski, glide, grip, comments)
                val db = FirebaseFirestore.getInstance().collection("projects")
                val id =  db.document().getId()

                db.document(id).set(project)
                    .addOnSuccessListener { Toast.makeText(this, "Stored Successfully", Toast.LENGTH_LONG).show() }
                    .addOnFailureListener { Log.w("DB_Issue", it.localizedMessage)}
            }
            else{
                Toast.makeText(this, "Date and Ski Required", Toast.LENGTH_LONG).show()
            }
        }

        binding.backButton.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)
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