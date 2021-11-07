package com.myntracommunity.teamincognito.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.myntracommunity.teamincognito.R
import kotlinx.android.synthetic.main.fragment_features.view.*


class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_profile, container, false)
       // (activity as AppCompatActivity).supportActionBar?.title = "Features Fragment"






        return v
    }
}