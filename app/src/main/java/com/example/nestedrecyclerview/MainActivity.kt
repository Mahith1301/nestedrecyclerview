package com.example.nestedrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.adapter.childAdapter
import com.example.nestedrecyclerview.adapter.parentadapter
import com.example.nestedrecyclerview.model.childmodel
import com.example.nestedrecyclerview.model.parentmodel


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var recyclerView: RecyclerView =findViewById(R.id.recyclerview)




        // Adding child models to each parent model
        val parentList: List<parentmodel> = ArrayList<parentmodel>().apply {
            add(parentmodel("Top Pick", getSampleChildList()))
            add(parentmodel("Top Games", getSampleChildList()))
            add(parentmodel("Top Pick", getSampleChildList()))
            add(parentmodel("Top Games", getSampleChildList()))

            // Add more parent models as needed
        }

        // Creating and setting up the parent adapter
        val parentAdapter = parentadapter(parentList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = parentAdapter
    }

        //adding name and image to applist


        //connecting applist with adapter

    private fun getSampleChildList(): List<childmodel> {
        return ArrayList<childmodel>().apply {
            add(childmodel("android", R.drawable.android1))
            add(childmodel("home", R.drawable.home1))
            add(childmodel("camera", R.drawable.camera1))
            add(childmodel("android", R.drawable.android1))
            add(childmodel("home", R.drawable.home1))
            add(childmodel("camera", R.drawable.camera1))
            add(childmodel("android", R.drawable.android1))
            add(childmodel("home", R.drawable.home1))
            add(childmodel("camera", R.drawable.camera1))
            // Add more child models as needed
        }


    }


}
