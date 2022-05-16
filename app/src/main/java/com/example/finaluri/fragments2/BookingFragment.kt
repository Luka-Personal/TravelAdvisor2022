package com.example.finaluri.fragments2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.finaluri.AppActivity
import com.example.finaluri.BookingActivity
import com.example.finaluri.R

class BookingFragment : Fragment(R.layout.fragment_booking) {

    private lateinit var information : Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        information= view.findViewById(R.id.button)
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()


        information.setOnClickListener {
            val intent = Intent (this@BookingFragment.requireContext(), BookingActivity::class.java)
            startActivity(intent)
        }



    }
}