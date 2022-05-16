package com.example.finaluri

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class BookingActivity : AppCompatActivity() {
    private lateinit var country : EditText
    private lateinit var departure : EditText
    private lateinit var returndate : EditText
    private lateinit var city : EditText
    private lateinit var cardnumber : EditText
    private lateinit var send : Button
    private lateinit var check : CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)


        country = findViewById(R.id.textView3)
        departure = findViewById(R.id.textView5)
        returndate = findViewById(R.id.textView6)
        city = findViewById(R.id.textView4)
        cardnumber = findViewById(R.id.textView8)
        send = findViewById(R.id.button2)
        check = findViewById(R.id.checkBoxBook)



        send.setOnClickListener {
            if (country.text.toString().isEmpty()) {
                Toast.makeText(this, "შეყვანეთ, სასურველი ქვეყანა", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (city.text.toString().isEmpty()) {
                Toast.makeText(this, "შეყვანეთ, სასურველი ქალაქი", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (departure.text.toString().isEmpty()) {
                Toast.makeText(this, "შეყვანეთ, გასვლის თარიღი", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (returndate.text.toString().isEmpty()) {
                Toast.makeText(this, "შეყვანეთ, დაბრუნების თარიღი", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (cardnumber.text.toString().isEmpty()) {
                Toast.makeText(this, "შეყვანეთ, ბარათის ინფორმაცია", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (cardnumber.text.toString().length != 16) {
                Toast.makeText(this, "ბარათის ნომრის სირგრძე არ უდრის 16-ს", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!check.isChecked) {
                Toast.makeText(this, "დაედანხმეთ terms and conditions", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else if(check.isChecked) {
             val recipient = "luka.tsinaridze.1@btu.edu.ge"
             val subject = "Booking"
             val message = country.text.toString()+", "+ city.text.toString()+", "+"Departure date: " + departure.text.toString()+", "+"Return date: " + returndate.text.toString()+", "+"Credit card: "+ cardnumber.text.toString()
             val mIntent = Intent(Intent.ACTION_SEND)
             mIntent.data = Uri.parse("mailto:")
             mIntent.type = "text/plain"
             mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient))
             mIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
             mIntent.putExtra(Intent.EXTRA_TEXT, message)


        try {
            startActivity(Intent.createChooser(mIntent, "აირჩიეთ, Email პროვაიდერი..."))
        }
        catch (e: Exception){
            Toast.makeText(this, "Email-ის აპლიკაცია ვერ მოიძებნა", Toast.LENGTH_LONG).show()
        }}}}}
