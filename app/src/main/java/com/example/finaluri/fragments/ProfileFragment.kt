package com.example.finaluri.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.finaluri.AppActivity
import com.example.finaluri.R
import com.example.finaluri.dataclass.DataClassName
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var OK : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        OK=view.findViewById(R.id.startApp)

        OK.setOnClickListener{
            val intent = Intent (this@ProfileFragment.requireContext(), AppActivity::class.java)
            startActivity(intent)

        }}}

