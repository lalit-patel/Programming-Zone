package com.patel.programmingzone.pythontheory

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.patel.programmingzone.adapter.CustomAdapter
import android.os.Bundle
import android.view.View
import com.patel.programmingzone.R
import androidx.recyclerview.widget.LinearLayoutManager

class QuestionPy : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var customAdapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.questionlist)
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.setHasFixedSize(true)
        val title = arrayOf(
            "1. Store three integers in x, y and z. Print their sum.",
            "2. Store two values in x and y and swap them.",
            "3. Take input of length and breadth of a rectangle from user and print area of it.",
            "4. Ask user to give two float input for length and breadth of a rectangle and print area type casted to int.",
            "5. Take two number and check whether the sum is greater than 5, less than 5 or equal to 5.",
            "6. Take two int values from user and print greatest among them.",
            "7. Take input of age of 3 people by user and determine oldest and youngest among them. ",
            "8. Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.\n" +
                    "if employee is female, then she will work only in urban areas.\n" +
                    "\n" +
                    "if employee is a male and age is in between 20 to 40 then he may work in anywhere\n" +
                    "\n" +
                    "if employee is male and age is in between 40 t0 60 then he will work in urban areas only.\n" +
                    "\n" +
                    "And any other input of age should print \"ERROR\".",
            "9. Take 10 integers from keyboard using loop and print their average value on the screen.",
            "10. Print multiplication table of 24, 50 and 29 using loop.",
            "11. Calculate the sum of digits of a number given by user. E.g.-\n" +
                    "INUPT : 123        OUPUT : 6\n" +
                    "INUPT : 12345        OUPUT : 15",
            "12. Take 10 integer inputs from user and store them in a list and print them on screen.",
            "13. Initialize and print each element in new line of a list inside list.",
            "14. Write a program to shift every element of a list to circularly right. E.g.-\n" +
                    "INPUT : 1 2 3 4 5\n" +
                    "OUTPUT : 5 1 2 3 4\n",
            "15. Create a Cricle class and intialize it with radius. Make two methods getArea and getCircumference inside this class.",
            "16. Create a Student class and initialize it with name and roll number. Make methods to :\n" +
                    "1. Display - It should display all informations of the student.\n" +
                    "2. setAge - It should assign age to student\n" +
                    "3. setMarks - It should assign marks to the student."
        )
        val htmlfiles = arrayOf(
            "Python/PythonQuestion/q01","Python/PythonQuestion/q02","Python/PythonQuestion/q03","Python/PythonQuestion/q04",
            "Python/PythonQuestion/q05","Python/PythonQuestion/q06","Python/PythonQuestion/q07","Python/PythonQuestion/q08",
            "Python/PythonQuestion/q09","Python/PythonQuestion/q10","Python/PythonQuestion/q11","Python/PythonQuestion/q12",
            "Python/PythonQuestion/q13","Python/PythonQuestion/q14","Python/PythonQuestion/q15","Python/PythonQuestion/q16",
        )
        customAdapter = CustomAdapter(this, title, htmlfiles)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = customAdapter
    }
}