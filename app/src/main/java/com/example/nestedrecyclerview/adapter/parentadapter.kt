package com.example.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.databinding.ParentItemLayoutBinding
import com.example.nestedrecyclerview.model.childmodel
import com.example.nestedrecyclerview.model.parentmodel

class parentadapter (private val parentmodel:List<parentmodel> ): RecyclerView.Adapter<parentadapter.parentviewholder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): parentviewholder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.parent_item_layout,parent,false)

        return  parentviewholder(view)
    }

    override fun getItemCount()=parentmodel.size

    override fun onBindViewHolder(holder: parentviewholder, position: Int) {
        val parentmodel = parentmodel[position]
        holder.textView.text = parentmodel.title
        val childAdapter = childAdapter(parentmodel.appmodel)
        holder.childmodel.adapter = childAdapter
        holder.childmodel.layoutManager = LinearLayoutManager(holder.itemView.context, LinearLayoutManager.HORIZONTAL, false)

    }
    inner class parentviewholder(itemView: View):RecyclerView.ViewHolder(itemView){
        val textView: TextView = itemView.findViewById(R.id.appheading)
        val childmodel: RecyclerView= itemView.findViewById(R.id.appchild)
    }
}