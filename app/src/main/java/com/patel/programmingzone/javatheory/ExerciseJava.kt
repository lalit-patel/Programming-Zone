package com.patel.programmingzone.javatheory

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.patel.programmingzone.adapter.CustomAdapter
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.patel.programmingzone.R
import androidx.recyclerview.widget.LinearLayoutManager

class ExerciseJava : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var customAdapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exerciselist)
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.setHasFixedSize(true)


        val title = arrayOf(
            "Percentage Calculator","Rock, Paper Scissor Game","Guess the Number","Online Library"
        )
        val htmlfiles = arrayOf(
            "Java/JavaExercise/java_ex1","Java/JavaExercise/java_ex2","Java/JavaExercise/java_ex3",
            "Java/JavaExercise/java_ex4"
        )
        customAdapter = CustomAdapter(this, title, htmlfiles)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = customAdapter

    }

}