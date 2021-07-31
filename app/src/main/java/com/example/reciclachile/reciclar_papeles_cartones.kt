package com.piratedog.reciclachile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class reciclar_papeles_cartones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reciclar_papeles_cartones)

        supportActionBar?.apply {
            title = ""
            setDisplayShowHomeEnabled(true)
            // Set whether to display the activity logo rather than the
            // activity icon. A logo is often a wider, more detailed image.
            setDisplayUseLogoEnabled(true)
            // Set the logo to display in the 'home' section of the action bar.
            setLogo(R.drawable.ecochilelogo)
        }
    }
}