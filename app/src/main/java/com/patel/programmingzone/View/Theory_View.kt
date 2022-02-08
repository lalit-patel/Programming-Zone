package com.patel.programmingzone.View

import androidx.appcompat.app.AppCompatActivity
import android.webkit.WebView
import android.os.Bundle
import com.patel.programmingzone.R
import android.webkit.WebSettings
import android.content.Intent
import android.view.View
import android.webkit.WebViewClient

class Theory_View : AppCompatActivity() {
    var webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullview)

        webView = findViewById<View>(R.id.webview) as WebView
        val webSettings = webView!!.settings
        webView!!.getSettings().setBuiltInZoomControls(true)
        val intent = intent
        val url = intent.getStringExtra("file")
        webView!!.loadUrl("file:///android_asset/$url.html")
        webView!!.webViewClient = WebViewClient()
    }
}
