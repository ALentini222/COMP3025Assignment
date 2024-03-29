package com.lakehead1141007.comp3025assignment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProjectAdapter (val context : Context,
                      private val projects : List<Project>,
                      private val itemListener : ProjectItemListener
) : RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>(){

    inner class ProjectViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val skiTextView = itemView.findViewById<TextView>(R.id.skiTextView)!!
        val dateTextView = itemView.findViewById<TextView>(R.id.dateTextView)!!
        val glideTextView = itemView.findViewById<TextView>(R.id.glideTextView)!!
        val gripTextView = itemView.findViewById<TextView>(R.id.gripTextView)!!
        val commentsTextView = itemView.findViewById<TextView>(R.id.commentsTextView)!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.ski_project, parent, false)
        return ProjectViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ProjectViewHolder, position: Int) {
        val project = projects[position]
        with(viewHolder){
            skiTextView.text = project.ski
            dateTextView.text = project.date
            glideTextView.text = project.glide
            gripTextView.text = project.grip
            commentsTextView.text = project.comments
            itemView.setOnClickListener {
                itemListener.projectSelected(project)
            }
        }
    }
    override fun getItemCount(): Int {
        return projects.size
    }


    interface ProjectItemListener{
        fun projectSelected(project : Project)
    }

}