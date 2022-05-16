package com.example.finaluri.fragments2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.finaluri.MainActivity
import com.example.finaluri.R
import com.google.firebase.auth.FirebaseAuth

class NoteExitFragment : Fragment(R.layout.fragment_about) {

    private lateinit var buttonLogout : Button
    private lateinit var buttonChangePass : Button
    private lateinit var contactus : TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        buttonLogout=view.findViewById(R.id.buttonLogout)
        buttonChangePass=view.findViewById(R.id.buttonChangepass)
        contactus= view.findViewById(R.id.textViewAbout2)
        val navController = Navigation.findNavController(view)





        contactus.setOnClickListener{
            val url = "https://www.facebook.com/traveladvisor4"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }


        buttonLogout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this@NoteExitFragment.requireContext(), MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        buttonChangePass.setOnClickListener{
            val goChangePass = NoteExitFragmentDirections.actionNoteExitFragmentToChangePasswordFragment()
            navController.navigate(goChangePass)
        }



    }}