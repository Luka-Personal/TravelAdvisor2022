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

class GoodCountryFragment : Fragment(R.layout.fragment_country) {

    private lateinit var recyclerView : RecyclerView
    private lateinit var recyclerGood : RecyclerGood

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerView = view.findViewById(R.id.recyclerViewGood)
        recyclerGood = RecyclerGood(data())
        recyclerView.layoutManager = LinearLayoutManager(this@GoodCountryFragment.requireContext())
        recyclerView.adapter = recyclerGood
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()

}


    private fun data() : List<DataClassGood> {
        var countryList = ArrayList<DataClassGood>()
        countryList.add(
            DataClassGood(
                1,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Spain.jpg",
                "Spain",
                "1."
            )
        )

        countryList.add(
            DataClassGood(
                2,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Italy.jpg",
                "Italy",
                "2."
            )
        )

        countryList.add(
            DataClassGood(
                3,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Greece.jpg",
                "Greece",
                "3."
            )
        )

        countryList.add(
            DataClassGood(
                4,
                "https://www.sciencekids.co.nz/images/pictures/flags680/New_Zealand.jpg",
                "New Zealand",
                "4."
            )
        )

        countryList.add(
            DataClassGood(
                5,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Australia.jpg",
                "Australia",
                "5."
            )
        )

        countryList.add(
            DataClassGood(
                6,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Portugal.jpg",
                "Portugal",
                "6."
            )
        )

        countryList.add(
            DataClassGood(
                7,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Brazil.jpg",
                "Brazil",
                "7."
            )
        )

        countryList.add(
            DataClassGood(
                8,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Ireland.jpg",
                "Ireland",
                "8."
            )
        )


        countryList.add(
            DataClassGood(
                9,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Thailand.jpg",
                "Thailand",
                "9."
            )
        )

        countryList.add(
            DataClassGood(
                10,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Mexico.jpg",
                "Mexico",
                "10."
            )
        )

        countryList.add(
            DataClassGood(
                11,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Switzerland.jpg",
                "Switzerland",
                "11. "
            )
        )


        countryList.add(
            DataClassGood(
                12,
                "https://www.sciencekids.co.nz/images/pictures/flags680/Netherlands.jpg",
                "Netherlands",
                "12. "
            )
        )


        return countryList
    }



}