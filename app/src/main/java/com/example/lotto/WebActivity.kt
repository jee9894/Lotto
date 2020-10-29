package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        // 크롬 이용 x
        web_view.webViewClient = WebViewClient()

        // 웹 뷰 옵션 설정
        var settings = web_view.settings
        // 자바스크립트 사용 설정
        settings.javaScriptEnabled = true

        web_view.loadUrl("http://www.daum.net")
    }
}