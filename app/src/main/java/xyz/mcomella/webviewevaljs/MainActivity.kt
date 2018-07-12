package xyz.mcomella.webviewevaljs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.KeyEvent
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.webViewClient = object : WebViewClient() {

        }

        webView.webChromeClient = object : WebChromeClient() {

        }

        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://www.cnn.com/videos/world/2018/07/11/thai-cave-soccer-team-rescue-operation-new-video-lon-orig.cnn")
    }

    override fun dispatchKeyEvent(event: KeyEvent?): Boolean {
        Log.d("lol", "dispatch called")
        webView.loadUrl("https://google.com")
        return true
    }
}
