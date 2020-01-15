package com.e.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.demo.recycleviewexample.RecycleViewActivity
import com.e.demo.webview.WebViewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleExample.setOnClickListener{
            startActivity(Intent(this@MainActivity, RecycleViewActivity::class.java))

        }
        webViewExample.setOnLongClickListener{
            val  webView=Intent(this@MainActivity, WebViewActivity::class.java)
            webView.putExtra("url","https://lauwba.com/")
            startActivity(webView)
            return@setOnLongClickListener true
        }
    }

}
