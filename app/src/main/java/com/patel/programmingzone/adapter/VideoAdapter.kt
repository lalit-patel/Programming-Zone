package com.patel.programmingzone.adapter

import android.content.ContentValues
import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.patel.programmingzone.R
import android.content.Intent
import android.util.Log
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.TextView
import com.patel.programmingzone.View.Video_View

class VideoAdapter(var context: Context, var title: Array<String>, var htmlFile: Array<String>) :
    RecyclerView.Adapter<VideoAdapter.VideoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoHolder {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.item_list, parent, false)
        return VideoHolder(view)
    }

    override fun onBindViewHolder(holder: VideoHolder, position: Int) {
        val startTime = System.currentTimeMillis()
        val htmlfile = htmlFile[position]
        holder.textView.text = title[position]
        setAnimation(holder.itemView)
        holder.linearLayout.setOnClickListener {
            val intent = Intent(context, Video_View::class.java)
            intent.putExtra("file", htmlfile)
            context.startActivity(intent)
        }
        Log.i(ContentValues.TAG, "bindView time: " + (System.currentTimeMillis() - startTime))
    }

    private fun setAnimation(view : View) {
        var animation : Animation = AnimationUtils.loadAnimation(context,android.R.anim.slide_in_left)
        view.animation = animation
    }

    override fun getItemCount(): Int {
        return htmlFile.size
    }

    inner class VideoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var linearLayout: LinearLayout
        var textView: TextView

        init {
            linearLayout = itemView.findViewById<View>(R.id.linear) as LinearLayout
            textView = itemView.findViewById<View>(R.id.title) as TextView
        }
    }

}