package com.example.reciclachile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acercade_.*
import kotlinx.android.synthetic.main.activity_main.*

class Acercade_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acercade_)

        btnpaypal()

    }
    public fun btnpaypal(){
        paypalbutton.setOnClickListener(){
            val ventanaMapa = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paypal.com/donate?hosted_button_id=KE8Z2MKAVUBD4"))
            startActivity(ventanaMapa)
        }
    }


}