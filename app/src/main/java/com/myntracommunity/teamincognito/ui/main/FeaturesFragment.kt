package com.myntracommunity.teamincognito.ui.main

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.myntracommunity.teamincognito.R
import kotlinx.android.synthetic.main.fragment_features.*


class FeaturesFragment : Fragment() {


    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_features, container, false)
        val mWebView = v.findViewById<View>(R.id.outfitWeb) as WebView
        mWebView.loadUrl("https://share.streamlit.io/amaanalikhan3000/bookish-doodle/main/app.py")
      //  (activity as AppCompatActivity).supportActionBar?.title = "Myntra Community"

        // Enable Javascript

        // Enable Javascript
        val webSettings: WebSettings = mWebView.settings
        webSettings.javaScriptEnabled = true

        // Force links and redirects to open in the WebView instead of in a browser

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.webViewClient = WebViewClient()
        return v
    }
}

