package com.patel.programmingzone.pythontheory

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.patel.programmingzone.adapter.CustomAdapter
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.patel.programmingzone.R
import androidx.recyclerview.widget.LinearLayoutManager

class TheoryPy : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var customAdapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theorylist)

        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.setHasFixedSize(true)

        val title = arrayOf(
            "Intro  -->","Syntax  -->", "Variable  -->", "Data Types  -->", "Type Casting  -->",
            "Operators  -->", "Strings  -->","List  -->","Tuple  -->","Set  -->", "If...Else  -->",
             "Loops  -->", "Functions","Arrays  -->",
            "Classes  -->", "Inheritance  -->", "Try Except  -->"
        )
        val htmlfiles = arrayOf(
            "Python/PythonTheory/intro","Python/PythonTheory/syntax","Python/PythonTheory/variables",
            "Python/PythonTheory/datatype","Python/PythonTheory/casting","Python/PythonTheory/operators",
            "Python/PythonTheory/strings","Python/PythonTheory/list","Python/PythonTheory/tuple",
            "Python/PythonTheory/set","Python/PythonTheory/ifelse","Python/PythonTheory/loops",
            "Python/PythonTheory/functions","Python/PythonTheory/arrays","Python/PythonTheory/classes",
            "Python/PythonTheory/inheritance","Python/PythonTheory/try"
        )
        customAdapter = CustomAdapter(this, title, htmlfiles)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = customAdapter
    }
}