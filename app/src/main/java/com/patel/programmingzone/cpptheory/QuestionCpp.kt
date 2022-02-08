package com.patel.programmingzone.cpptheory

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.patel.programmingzone.adapter.CustomAdapter
import android.os.Bundle
import android.view.View
import com.patel.programmingzone.R
import androidx.recyclerview.widget.LinearLayoutManager

class QuestionCpp : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var customAdapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.questionlist)
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.setHasFixedSize(true)

        val title = arrayOf(
            "1. Write a C++ program to print\n" +
                    "*\n" +
                    "**\n" +
                    "***\n" +
                    "****\n" +
                    "on screen.",
            "2. Write a program to take the input of an int and print it on the screen.",
            "3. Store two integers in two variables x and y. Print the sum of the two.",
            "4. Write a C++ program to take two integer inputs from user and print sum and product of them.",
            "5. Write a program to assign a value of 100.235 to a double variable and then convert it to int.",
            "6. Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.",
            "7. Write a program to input the value of the radius of a circle from keyboard and then calculate its perimeter and area. ",
            "8. Now solve the above question to check if atleast one of the conditions 'a < 50' and 'a < b' is true.",
            "9. Write a program to calculate the sum of the first and the second last digit of a 5 digit.\n" +
                    "E.g.- NUMBER : 12345\n" +
                    "OUTPUT : 1+4=5",
            "10. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.\n" +
                    "Ask user for quantity\n" +
                    "Suppose, one unit will cost 100.\n" +
                    "Judge and print total cost for user.",
            "11. Take values of length and breadth of a rectangle from user and check if it is square or not.",
            "12. Take 10 integers from keyboard using loop and print their average value on the screen.",
            "13. Print multiplication table of 24, 50 and 29 using loop.",
            "14. Write a program to find prime factor of a number.\n" +
                    "If a factor of a number is prime number then it is its prime factor.",
            "15. Define a function to find out if number is prime or not.",
            "16. Define a program to find out whether a given number is even or odd.",
            "17. Print the multiplication table of 15 using recursion.",
            "18. Write a program to print the address of a variable whose value is input from user.",
            "19. Write a program to print a number which is entered from keyboard using pointer.",
            "20. Take 10 integer inputs from user and store them in an array and print them on screen.",
            "21. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in another array but in reverse order.",
            "22. Write a program to shift every element of an array to circularly right. E.g.-\n" +
                    "INPUT : 1 2 3 4 5\n" +
                    "OUTPUT : 5 1 2 3 4",
        )
        val htmlfiles = arrayOf(
            "Cpp/CppQuestion/q01", "Cpp/CppQuestion/q02", "Cpp/CppQuestion/q03", "Cpp/CppQuestion/q04",
            "Cpp/CppQuestion/q05", "Cpp/CppQuestion/q06", "Cpp/CppQuestion/q07", "Cpp/CppQuestion/q08",
            "Cpp/CppQuestion/q09", "Cpp/CppQuestion/q10","Cpp/CppQuestion/q11","Cpp/CppQuestion/q12",
            "Cpp/CppQuestion/q13", "Cpp/CppQuestion/q14","Cpp/CppQuestion/q15","Cpp/CppQuestion/q16",
            "Cpp/CppQuestion/q17", "Cpp/CppQuestion/q18","Cpp/CppQuestion/q19","Cpp/CppQuestion/q20",
            "Cpp/CppQuestion/q21", "Cpp/CppQuestion/q22"
        )
        customAdapter = CustomAdapter(this, title, htmlfiles)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = customAdapter
    }
}