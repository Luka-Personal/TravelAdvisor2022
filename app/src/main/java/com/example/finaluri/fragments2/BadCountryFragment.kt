package com.example.finaluri.fragments2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finaluri.R
import com.example.finaluri.dataclass.DataClassGood
import com.example.finaluri.pagers.RecyclerGood
import java.util.ArrayList

class BadCountryFragment : Fragment(R.layout.fragment_country) {

    private lateinit var recyclerView : RecyclerView
    private lateinit var recyclergood: RecyclerGood

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerView = view.findViewById(R.id.recyclerViewGood)
        recyclergood = RecyclerGood(data())
        recyclerView.layoutManager = LinearLayoutManager(this@BadCountryFragment.requireContext())
        recyclerView.adapter = recyclergood
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()

    }


    private fun data() : List<DataClassGood> {
        var countryList = ArrayList<DataClassGood>()
        countryList.add(
            DataClassGood(
                1,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Somalia.jpg",
                "Somalia",
                "1."
            )
        )

        countryList.add(
            DataClassGood(
                2,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Afghanistan.jpg",
                "Afghanistan",
                "2."
            )
        )

        countryList.add(
            DataClassGood(
                3,
                "https://www.sciencekids.co.nz/images/pictures/flags680/North_Korea.jpg",
                "North Korea",
                "3."
            )
        )

        countryList.add(
            DataClassGood(
                4,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Iraq.jpg",
                "Iraq",
                "4."
            )
        )

        countryList.add(
            DataClassGood(
                5,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Yemen.jpg",
                "Yemen",
                "5."
            )
        )

        countryList.add(
            DataClassGood(
                6,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Venezuela.jpg",
                "Venezuela",
                "6."
            )
        )

        countryList.add(
            DataClassGood(
                7,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Syria.jpg",
                "Syria",
                "7."
            )
        )

        countryList.add(
            DataClassGood(
                8,
                "https://www.sciencekids.co.nz/images/pictures/flags680/South_Sudan.jpg",
                "South Sudan",
                "8."
            )
        )


        countryList.add(
            DataClassGood(
                9,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Mali.jpg",
                "Mali",
                "9."
            )
        )

        countryList.add(
            DataClassGood(
                10,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Libya.jpg",
                "Libya",
                "10."
            )
        )

        countryList.add(
            DataClassGood(
                11,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Iran.jpg",
                "Iran",
                "11."
            )
        )


        countryList.add(
            DataClassGood(
                12,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Central_African_Republic.jpg",
                "CAR",
                "12."
            )
        )


        return countryList
    }



}