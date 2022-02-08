package com.patel.programmingzone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.patel.programmingzone.cpptheory.CppMenu
import com.patel.programmingzone.javatheory.JavaMenu
import com.patel.programmingzone.pythontheory.PythonMenu
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        javaopen()
        cppopen()
        pyopen()
    }

    private fun pyopen() {
        pythoniv.setOnClickListener {
            startActivity(Intent(this,PythonMenu::class.java))
        }
        pythonbtn .setOnClickListener {
            startActivity(Intent(this,PythonMenu::class.java))
        }
    }

    fun javaopen(){
        javaiv.setOnClickListener {
            startActivity(Intent(this,JavaMenu::class.java))
        }
        javabtn.setOnClickListener {
            startActivity(Intent(this,JavaMenu::class.java))
        }
    }
    fun cppopen(){
        cppiv.setOnClickListener {
            startActivity(Intent(this,CppMenu::class.java))
        }
        cppbtn.setOnClickListener {
            startActivity(Intent(this,CppMenu::class.java))
        }
    }
}