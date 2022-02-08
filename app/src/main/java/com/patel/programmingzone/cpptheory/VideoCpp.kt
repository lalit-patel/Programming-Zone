package com.patel.programmingzone.cpptheory

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.patel.programmingzone.R
import com.patel.programmingzone.adapter.VideoAdapter

class VideoCpp : AppCompatActivity() {


    var recyclerView: RecyclerView? = null
    var customAdapter: VideoAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.videolist)
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.setHasFixedSize(true)

        val title = arrayOf(
            "Get Started","Variables","Variables and Datatype","Input","If-Else", "Loops","Pointers",
            "Arrays","Function","Function Overloading","Recursion","Oop","Classes",
            "Access Modifiers","Friend Functioin","Constructors","Inheritance","Polymorphism","Abstract Class and Methods"
        )
        val htmlfiles = arrayOf(
            "j8nAHeVKL08","jigb6W35zHc","JrnQ-915czY","J05uoTbGOvQ","AY96XFqb934","a7dfSBrTZtE","EvYmTCx9BFs",
            "ePJxpxsnkGw","RFLFX1boGwo","8qZb09suSHY","JRKs3s15Kjc","nGJTWaaFdjc","tL8vnfFFzVQ",
            "25zw-ljLLw0","HK6gnkQIgq","EEJUPXFKe8Q","RO1ZYW9NAzg","B-WWdC-H0zw","RBAWWutf0fY",

        )
        customAdapter = VideoAdapter(this, title, htmlfiles)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = customAdapter
    }
}