package com.e.demo.recycleviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.demo.R
import kotlinx.android.synthetic.main.activity_recycle_view.*

class RecycleViewActivity : AppCompatActivity() {
    private val imageList= arrayListOf(
        "https://www.lauwba.com/layanan/jasa-pembuatan-website-makassar-lauwba-techno.jpg",
        "https://www.lauwba.com/layanan/jasa-periklanan-google-dan-facebook-makassar.jpg",
        "https://www.lauwba.com/layanan/training-web-android-lauwba-techno.jpg")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)
        val adapter=AdapterGaleri(imageList)
        galeri.adapter=adapter

    }
}
