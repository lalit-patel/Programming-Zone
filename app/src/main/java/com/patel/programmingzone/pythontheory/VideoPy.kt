package com.patel.programmingzone.pythontheory

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.patel.programmingzone.R
import com.patel.programmingzone.adapter.VideoAdapter

class VideoPy : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var customAdapter: VideoAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.videolist)

        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.setHasFixedSize(true)

        val title = arrayOf(
            "Get Started","Variables and Datatype","List","Set","Data Type","Operators","If Else",
            "While loop","For loop","Array","Functions","Recursion","Oop","Classes",
            "Constructor","Inheritance","Exception Handling"
        )
        val htmlfiles = arrayOf(
            "DWgzHbglNIo","TqPzwenhMj0","Eaz5e6M8tL4","Mf7eFtbVxFM","gCCVsvgR2KU","v5MR5JnKcZI","PqFKRqpHrjw",
            "HZARImviDxg","0ZvaDa8eT5s","6a39OjkCN5","BVfCWuca9nw","XkL3SUioNvo","gZwPdqC2Os0","8O5kX73OkIY",
            "ic6wdPxcHc0","Cn7AkDb4pIU","6SPDvPK38tw"
        )
        customAdapter = VideoAdapter(this, title, htmlfiles)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = customAdapter
    }
}