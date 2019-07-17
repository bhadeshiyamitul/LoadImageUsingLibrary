package com.ubrain.loadimageusinglibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var mImgDownloadGlide: ImageView
    private var urlS: String? = "https://www.google.com/logos/2013/estonia_independence_day_2013-1057005.3-hp.jpg"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        mImgDownloadGlide = findViewById<ImageView>(R.id.imgDownloadGlide)
        mImgDownloadGlide.setOnClickListener {
            Glide.with(this).load(urlS).into(mImgDownloadGlide!!)
        }

    }
}
