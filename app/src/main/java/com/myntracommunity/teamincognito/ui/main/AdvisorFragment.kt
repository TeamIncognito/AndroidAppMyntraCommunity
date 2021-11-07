package com.myntracommunity.teamincognito.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.myntracommunity.teamincognito.R

class AdvisorFragment : Fragment() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_advisor, container, false)
        val mWebView = v.findViewById<View>(R.id.outfitWeb) as WebView
        mWebView.loadUrl("https://share.streamlit.io/amaanalikhan3000/bookish-doodle/main/app.py")

        // Enable Javascript

        // Enable Javascript
        val webSettings: WebSettings = mWebView.getSettings()
        webSettings.javaScriptEnabled = true

        // Force links and redirects to open in the WebView instead of in a browser

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.webViewClient = WebViewClient()
        return v
    }


}