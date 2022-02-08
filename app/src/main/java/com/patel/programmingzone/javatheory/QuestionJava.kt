package com.patel.programmingzone.javatheory

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.patel.programmingzone.adapter.CustomAdapter
import android.os.Bundle
import android.view.View
import com.patel.programmingzone.R
import androidx.recyclerview.widget.LinearLayoutManager

class QuestionJava : AppCompatActivity() {

    var recyclerView: RecyclerView? = null
    var customAdapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.questionlist)
        recyclerView = findViewById<View>(R.id.recyclerView) as RecyclerView
        recyclerView!!.setHasFixedSize(true)
        val title = arrayOf(
            "1. Write a program to get the following output.\n" +
                    "            Hey there,\n" +
                    "            I am data!",
            "2.Write a program to print\n" +
                    "            *\n" +
                    "            **\n" +
                    "            ***\n" +
                    "            ****\n" +
                    "            on screen.",
            "3. Write a program to print the difference and product of the numbers 45 and 32.",
            "4. Write a Java program to print an int, a double and a char on screen",
            "5. Write a program to assign a value of 100.235 to a double variable and then convert it to int.",
            "6. Write a program to add an integer variable having value 5 and a double variable having value 6.2.",
            "7. Write a program to find the square of the number 3.9 ",
            "8. Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.",
            "9. Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.",
            "10. Write a program to print the power of 7 raised to 5.",
            "11. Write a program to calculate the sum of the first and the second last digit of a 5 digit.\n" +
                    "            E.g.- NUMBER : 12345        OUTPUT : 1+4=5",
            "12. Write a program to reverse a 3-digit number. E.g.-Number : 132        Output : 231",
            "13. Write a program to take two integer inputs from user and print sum and product of them.",
            "14. Take side of a square from user and print area and perimeter of it.",
            "15. Take values of length and breadth of a rectangle from user and check if it is square or not.",
            "16. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.\n" +
                    "            Ask user for quantity\n" +
                    "            Suppose, one unit will cost 100.\n" +
                    "            Judge and print total cost for user.",
            "17. A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-\n" +
                    "            INPUT : 1234        OUTPUT : 4321\n" +
                    "            INPUT : 5982        OUTPUT : 2895",
            "18. Take 10 integers from keyboard using loop and print their average value on the screen",
            "19. Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.",
            "20. A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.\n" +
                    "            E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.\n" +
                    "            Write all Armstrong numbers between 100 to 500.",
            "21. Take 10 integer inputs from user and store them in an array and print them on screen.",
            "22. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.",
            "23. Find largest and smallest elements of an array."
        )
        val htmlfiles = arrayOf(
            "Java/JavaQuestion/q01","Java/JavaQuestion/q02","Java/JavaQuestion/q03","Java/JavaQuestion/q04",
            "Java/JavaQuestion/q05","Java/JavaQuestion/q06","Java/JavaQuestion/q07","Java/JavaQuestion/q08",
            "Java/JavaQuestion/q09","Java/JavaQuestion/q10","Java/JavaQuestion/q11","Java/JavaQuestion/q12",
            "Java/JavaQuestion/q13","Java/JavaQuestion/q14","Java/JavaQuestion/q15","Java/JavaQuestion/q16",
            "Java/JavaQuestion/q17","Java/JavaQuestion/q18","Java/JavaQuestion/q19","Java/JavaQuestion/q20",
            "Java/JavaQuestion/q21","Java/JavaQuestion/q22","Java/JavaQuestion/q23",
        )
        customAdapter = CustomAdapter(this, title, htmlfiles)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = customAdapter
    }

}