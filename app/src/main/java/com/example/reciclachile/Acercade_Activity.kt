package com.piratedog.reciclachile

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

        supportActionBar?.apply {
            title = ""
            setDisplayShowHomeEnabled(true)
            // Set whether to display the activity logo rather than the
            // activity icon. A logo is often a wider, more detailed image.
            setDisplayUseLogoEnabled(true)
            // Set the logo to display in the 'home' section of the action bar.
            setLogo(R.drawable.ecochilelogo)
        }

        btnpaypal()

        btninsta()
    }
    private fun btnpaypal(){
        paypalbutton.setOnClickListener(){
            val ventanaMapa = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.paypal.com/donate?hosted_button_id=KE8Z2MKAVUBD4"))
            startActivity(ventanaMapa)
        }
    }

    private fun btninsta(){
        btninsta.setOnClickListener(){
            val ventana = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ecochilerecicla/"))
            startActivity(ventana)
        }
    }


}