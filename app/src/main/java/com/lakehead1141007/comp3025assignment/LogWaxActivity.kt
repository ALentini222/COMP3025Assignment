package com.lakehead1141007.comp3025assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.lakehead1141007.comp3025assignment.databinding.ActivityLogWaxBinding
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class LogWaxActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLogWaxBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogWaxBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth
        binding.submitButton.setOnClickListener{
            val date = binding.editTextDate.text.toString().trim()
            val ski = binding.skiEntry.text.toString().trim()
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

                val db = FirebaseFirestore.getInstance().collection("projects")

                val id =  db.document().getId()

                var uID = auth.currentUser!!.uid

                val project = Project(date, ski, glide, grip, comments, id, uID)

                db.document(id).set(project)
                    .addOnSuccessListener {
                        Toast.makeText(this, "Stored Successfully", Toast.LENGTH_LONG).show()
                    }
                    .addOnFailureListener { Log.w("DB_Issue", it.localizedMessage)}
            }
            else{
                Toast.makeText(this, "Date and Ski Required", Toast.LENGTH_LONG).show()
            }
        }

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