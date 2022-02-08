package com.patel.programmingzone.cpptheory

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.patel.programmingzone.adapter.CustomAdapter
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.patel.programmingzone.R
import androidx.recyclerview.widget.LinearLayoutManager

class ExerciseCpp : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var customAdapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exerciselist)
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.setHasFixedSize(true)

        val title = arrayOf(
            "Bookshop inventory system","Casino Number Guessing Game",
            "Credit Card Validator","Sudoku Game "
        )
        val htmlfiles = arrayOf(
            "Cpp/CppExercise/Cpp_ex1","Cpp/CppExercise/Cpp_ex2","Cpp/CppExercise/Cpp_ex3","Cpp/CppExercise/Cpp_ex4"
        )
        customAdapter = CustomAdapter(this, title, htmlfiles)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = customAdapter
    }

}