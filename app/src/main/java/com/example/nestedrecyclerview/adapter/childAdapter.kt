package com.example.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.model.childmodel



class childAdapter(private val appList: List<childmodel>) : RecyclerView.Adapter<childAdapter.modelViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): modelViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.child_app_layout, parent, false)

        return modelViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: modelViewHolder, position: Int) {
        val childmodel = appList[position]
        holder.textView.text = childmodel.appname
        holder.imageView.setImageResource(childmodel.appimage)
    }

    override fun getItemCount(): Int {
        return appList.size
    }

    class modelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.apptextview)
        val imageView: ImageView = itemView.findViewById(R.id.appimage)
    }
}