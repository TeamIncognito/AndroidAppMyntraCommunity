package com.myntracommunity.teamincognito.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.myntracommunity.teamincognito.R
import com.myntracommunity.teamincognito.ui.adapter.VideoAdapter.myviewholder
import com.myntracommunity.teamincognito.ui.model.VideoModel
import java.util.*

class VideoAdapter(var videos: ArrayList<VideoModel>) : RecyclerView.Adapter<myviewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.single_video_row, parent, false)
        return myviewholder(view)
    }

    override fun onBindViewHolder(holder: myviewholder, position: Int) {
        holder.setdata(videos[position])
    }

    override fun getItemCount(): Int {
        return videos.size
    }

    inner class myviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var videoView: VideoView
        var title: TextView
        var desc: TextView
        var pbar: ProgressBar? = null
        fun setdata(obj: VideoModel) {
            videoView.setVideoPath(obj.url)
            title.text = obj.desc
            desc.text = obj.desc
            videoView.setOnPreparedListener { mediaPlayer -> mediaPlayer.start() }
            videoView.setOnCompletionListener { mediaPlayer -> mediaPlayer.start() }
        }

        init {
            videoView = itemView.findViewById(R.id.videoView)
            title = itemView.findViewById(R.id.textVideoTitle)
            desc = itemView.findViewById(R.id.textVideoDescription)
        }
    }
}