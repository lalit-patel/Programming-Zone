package com.patel.programmingzone.javatheory

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.patel.programmingzone.R
import com.patel.programmingzone.adapter.VideoAdapter

class VideoJava : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var customAdapter: VideoAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.videolist)
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.setHasFixedSize(true)


        val title = arrayOf(
            "Get Started","Hello World","Variables and Datatype","Input","String","If-Else","Switch Case",
            "Loops","Arrays","Method","Method Overloading","Recursion","Access modifiers, getters and setters",
            "Constuctor","Inheritance","Method Overriding","Abstract Class and Methods","Interface",
            "Exception Handling","MultiThreading","Collections","Packages"
        )
        val htmlfiles = arrayOf(
            "ntLJmHOJ0ME","zIdg7hkqNE0","X0zdAG7gfgs","HRfmLqqvzUs","tem1bKt2Osc","YPK6NYMJt_A",
            "hdOtQSuPBRY","oAl0umTfW4U","qMePCtjeqB4","t6e5AyYWLFw","pFaB68naMiU","QLbG77JngYc",
            "25zw-ljLLw0","Fxj4n8En8lw","XSuybcFfLx4","DSZI90Db24I","vqV22AszAdw","VYhmL038G1I",
            "rzA7UJ-hQn4","k7TwStbkK70"
        )
        customAdapter = VideoAdapter(this, title, htmlfiles)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = customAdapter
    }
}