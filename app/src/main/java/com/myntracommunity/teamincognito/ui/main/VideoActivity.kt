package com.myntracommunity.teamincognito.ui.main

import android.os.Bundle
import android.view.View
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.myntracommunity.teamincognito.R
import com.myntracommunity.teamincognito.ui.adapter.VideoAdapter
import com.myntracommunity.teamincognito.ui.model.VideoModel
import java.util.*

@Suppress("DEPRECATION")
class VideoActivity : AppCompatActivity() {
    var viewPager2: ViewPager2? = null

    //videoadapter adapter;
    var videos: ArrayList<VideoModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)


        window.setFlags(
            FLAG_FULLSCREEN,
            FLAG_FULLSCREEN
        )
        viewPager2 = findViewById<View>(R.id.vpager) as ViewPager2
        videos = ArrayList()
        val ob1 = VideoModel(
            "Facewash",
            "Barkha Singh",
            "https://firebasestorage.googleapis.com/v0/b/myntra-community-teamincognito.appspot.com/o/WhatsApp%20Video%202021-11-03%20at%203.20.15%20AM.mp4?alt=media&token=171a356a-efdb-41ec-8ac6-31497e1d09b9"
        )
        videos!!.add(ob1)
        val ob2 = VideoModel(
                "Zara Unboxing",
                "ZARA",
            "https://firebasestorage.googleapis.com/v0/b/myntra-community-teamincognito.appspot.com/o/WhatsApp%20Video%202021-11-03%20at%203.08.31%20AM.mp4?alt=media&token=e75671bc-002c-4be2-a4ac-a4b3043bdc99"
        )
        videos!!.add(ob2)
        val ob3 = VideoModel(
            "Myntra Shirt",
            "Myntra",
            "https://firebasestorage.googleapis.com/v0/b/myntra-community-teamincognito.appspot.com/o/WhatsApp%20Video%202021-11-03%20at%203.09.22%20AM.mp4?alt=media&token=3b9c4f16-6856-4d9f-9796-2e6ed7703ce8"
        )
        videos!!.add(ob3)
        val ob4 = VideoModel(
            "Women Ethnic Wear",
            "Myntra",
            "https://firebasestorage.googleapis.com/v0/b/myntra-community-teamincognito.appspot.com/o/WhatsApp%20Video%202021-11-03%20at%203.10.36%20AM.mp4?alt=media&token=567e937a-e588-4090-aeb3-0d84b6797d8d"
        )
        videos!!.add(ob4)
        val ob5 = VideoModel(
            "Fashion Styles",
            "hey",
            "https://firebasestorage.googleapis.com/v0/b/myntra-community-teamincognito.appspot.com/o/WhatsApp%20Video%202021-11-03%20at%203.20.15%20AM.mp4?alt=media&token=171a356a-efdb-41ec-8ac6-31497e1d09b9"
        )
        videos!!.add(ob5)
        viewPager2!!.adapter = VideoAdapter(videos!!)
    }
}