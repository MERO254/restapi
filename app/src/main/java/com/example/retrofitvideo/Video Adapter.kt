package com.example.retrofitvideo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView

class VideoAdapter (var videoList:List<Video>):RecyclerView.Adapter<VideoAdapter.ViewHolder>(){
    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        var video:VideoView = view.findViewById(R.id.videoView)
        var title:TextView = view. findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.videolayout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return videoList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var ItemPosition = videoList[position]

        holder.video.setVideoURI(ItemPosition.Video)
        holder.video.requestFocus()
        holder.video.start()
        
        holder.title.text = ItemPosition.title
    }
}