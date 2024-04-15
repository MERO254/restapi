package com.example.retrofitvideo

import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var videoList = listOf(Video(Uri.parse("android.resource://$packageName/${R.raw.video1}"),"video 1"),
            Video(Uri.parse("android.resource://$packageName/${R.raw.video2}"),"video 2")
        )

        var recycler:RecyclerView = findViewById(R.id.recy)
        var adapter = VideoAdapter(videoList)
        recycler.adapter = adapter
        adapter.notifyDataSetChanged()

        recycler.layoutManager = LinearLayoutManager(this)



    }
}