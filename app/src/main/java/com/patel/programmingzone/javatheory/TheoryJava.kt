package com.patel.programmingzone.javatheory

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.patel.programmingzone.adapter.CustomAdapter
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.patel.programmingzone.R
import androidx.recyclerview.widget.LinearLayoutManager

class TheoryJava : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var customAdapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theorylist)
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.setHasFixedSize(true)


        val title = arrayOf(
            "Get Started  -->","Syntax  -->", "Variable  -->", "Data Types  -->", "Type Casting  -->",
            "Operators  -->", "Strings  -->", "If...Else  -->", "Switch Case  -->", "Loops  -->", "Arrays  -->",
            "Method and Methods Overloading  -->", "Recursion  -->", "Access Modifiers  -->",
            "Constructors  -->","Encapsulation  -->", "Inheritance  -->","Polymorphism  -->", "Abstract Class and Methods  -->","Interface  -->",
            "Exception Handling  -->", "MultiThreading  -->", "Packages  -->"
        )
        val htmlfiles = arrayOf(
            "Java/JavaTheory/java_get_started", "Java/JavaTheory/java_syntax",
            "Java/JavaTheory/java_variables", "Java/JavaTheory/java_data_type",
            "Java/JavaTheory/java_type_casting", "Java/JavaTheory/java_operators",
            "Java/JavaTheory/java_strings", "Java/JavaTheory/java_if_else",
            "Java/JavaTheory/java_switch_case", "Java/JavaTheory/java_loops",
            "Java/JavaTheory/java_arrays", "Java/JavaTheory/java_methods_overloading",
            "Java/JavaTheory/java_recursion", "Java/JavaTheory/java_access_modifiers",
            "Java/JavaTheory/java_constructors","Java/JavaTheory/java_encapsulation", "Java/JavaTheory/java_inheritance",
            "Java/JavaTheory/java_polymorphism", "Java/JavaTheory/java_abstract_class", "Java/JavaTheory/java_interface",
            "Java/JavaTheory/java_exception", "Java/JavaTheory/java_multithreading",
            "Java/JavaTheory/java_packages"
        )
        customAdapter = CustomAdapter(this, title, htmlfiles)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = customAdapter
    }

}