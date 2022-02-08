package com.patel.programmingzone.View

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import com.patel.programmingzone.R

class Video_View : YouTubeBaseActivity() {

    val YT_API_KEY = "AIzaS**************************AE"

    private lateinit var youtubePlayer: YouTubePlayerView
    private lateinit var btnplay: Button

    lateinit var youtubePlayerInit : YouTubePlayer.OnInitializedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_vdoplaylist)

        youtubePlayer = findViewById(R.id.ytplayer)
        btnplay = findViewById(R.id.btnplay)


        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean,
            ) {
                val url = intent.getStringExtra("file")
                p1?.loadVideo(url)
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?,
            ) {
                Toast.makeText(applicationContext,"Failed", Toast.LENGTH_SHORT).show()
            }


        }
        btnplay.setOnClickListener {
            youtubePlayer.initialize(YT_API_KEY,youtubePlayerInit)
        }
    }

}