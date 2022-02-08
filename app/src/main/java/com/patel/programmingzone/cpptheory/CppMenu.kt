package com.patel.programmingzone.cpptheory

import com.patel.programmingzone.javatheory.ExerciseJava
import com.patel.programmingzone.javatheory.QuestionJava
import com.patel.programmingzone.javatheory.TheoryJava
import com.patel.programmingzone.javatheory.VideoJava
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.patel.programmingzone.R
import kotlinx.android.synthetic.main.activity_java_menu.*

class CppMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cpp_menu)

        theorybtn.setOnClickListener {
            startActivity(Intent(this, TheoryCpp::class.java))
        }
        vdobtn.setOnClickListener {
            startActivity(Intent(this, VideoCpp::class.java))
        }
        exbtn.setOnClickListener {
            startActivity(Intent(this, ExerciseCpp::class.java))
        }
        questionbtn.setOnClickListener {
            startActivity(Intent(this, QuestionCpp::class.java))
        }

        sharebtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val sharingIntent = Intent(Intent.ACTION_SEND)
                sharingIntent.type = "text/plain"
                val shareBody = "Checkout this app to learn programming with complete theory, video & programs tutorials. \n" +
                        "\n" +
                        "Download Programming Zone app for free: " +
                        "\n https://play.google.com/store/apps/details?id=com.patel.programmingzone"
                val shareSub = "Your subject here"
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub)
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody)
                startActivity(Intent.createChooser(sharingIntent, "Share using"))
            }
        })
    }
}