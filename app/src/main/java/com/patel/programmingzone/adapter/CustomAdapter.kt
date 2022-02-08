package com.patel.programmingzone.adapter

import android.content.ContentValues.TAG
import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.patel.programmingzone.adapter.CustomAdapter.CustomHolder
import android.view.ViewGroup
import android.view.LayoutInflater
import com.patel.programmingzone.R
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.patel.programmingzone.View.Theory_View
import android.view.animation.Animation
import android.view.animation.AnimationUtils

class CustomAdapter(var context: Context, var title: Array<String>, var htmlFile: Array<String>) :
    RecyclerView.Adapter<CustomHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.item_list, parent, false)
        return CustomHolder(view)
    }

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        val startTime = System.currentTimeMillis()
        val htmlfile = htmlFile[position]
        holder.textView.text = title[position]
        setAnimation(holder.itemView)
        holder.linearLayout.setOnClickListener {
            val intent = Intent(context, Theory_View::class.java)
            intent.putExtra("file", htmlfile)
            context.startActivity(intent)
        }

        Log.i(TAG, "bindView time: " + (System.currentTimeMillis() - startTime))
    }
    
    private fun setAnimation(view : View) {
        var animation : Animation = AnimationUtils.loadAnimation(context,android.R.anim.slide_in_left)
        view.animation = animation
    }

    override fun getItemCount(): Int {
        return htmlFile.size
    }

    inner class CustomHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var linearLayout: LinearLayout
        var textView: TextView

        init {
            linearLayout = itemView.findViewById<View>(R.id.linear) as LinearLayout
            textView = itemView.findViewById<View>(R.id.title) as TextView
        }
    }
}