package com.lakehead1141007.comp3025assignment;

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class ProjectViewModel : ViewModel() {
    private val projects = MutableLiveData<List<Project>>()
    private var auth : FirebaseAuth = Firebase.auth

    init{
        val uID = auth.currentUser?.uid

        val db = FirebaseFirestore.getInstance().collection("projects")
            .whereEqualTo("uid", uID)
            .orderBy("ski")
            .addSnapshotListener{ documents, exception ->
                if (exception != null)
                {
                    Log.w("DB_Response","Listen Failed ${exception.code}")
                    return@addSnapshotListener
                }

                Log.i("DB_Response", "# of documents = ${documents!!.size()}")
                documents?.let{
                    val projectList = ArrayList<Project>()
                    for (document in documents)
                    {
                        Log.i("DB_Response", "${document.data}")
                        val project = document.toObject(Project::class.java)
                        projectList.add(project)
                    }
                    projects.value = projectList
                }
            }
    }

    fun getProjects() : LiveData<List<Project>>
    {
        return projects
    }

}