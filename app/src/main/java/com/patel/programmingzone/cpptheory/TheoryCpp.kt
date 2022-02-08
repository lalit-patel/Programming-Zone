package com.patel.programmingzone.cpptheory

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.patel.programmingzone.adapter.CustomAdapter
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.patel.programmingzone.R
import androidx.recyclerview.widget.LinearLayoutManager

class TheoryCpp : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var customAdapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theorylist)
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.setHasFixedSize(true)
        val title = arrayOf(
            "Introduction  -->","Syntax  -->", "Variable  -->", "Data Types  -->",
            "Operators  -->", "Strings  -->", "If...Else  -->", "Switch Case  -->", "Loops  -->", "Arrays  -->",
            "References  -->","Pointers  -->","Functions  -->", "Function Parameters  -->", "Function Overloading  -->",
            "OOP  -->", "Classes/Objects  -->","Constructors", "Access Specifier  -->","Encapsulation  -->",
            "Inheritance  -->", "Polymorphism  -->", "Files  -->","Exceptions  -->"
        )
        val htmlfiles = arrayOf(
            "Cpp/CppTheory/Intro", "Cpp/CppTheory/syntax","Cpp/CppTheory/variable","Cpp/CppTheory/datatype",
            "Cpp/CppTheory/operators","Cpp/CppTheory/strings","Cpp/CppTheory/ifelse","Cpp/CppTheory/switchcase",
            "Cpp/CppTheory/loops","Cpp/CppTheory/arrays","Cpp/CppTheory/references","Cpp/CppTheory/pointers",
            "Cpp/CppTheory/functions","Cpp/CppTheory/functionparameters","Cpp/CppTheory/functionoverloading",
            "Cpp/CppTheory/oop", "Cpp/CppTheory/classes","Cpp/CppTheory/constructors","Cpp/CppTheory/accessspecifier",
            "Cpp/CppTheory/encapsulation", "Cpp/CppTheory/inheritance","Cpp/CppTheory/polymorphism","Cpp/CppTheory/files",
            "Cpp/CppTheory/exceptions",
        )
        customAdapter = CustomAdapter(this, title, htmlfiles)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = customAdapter
    }
}