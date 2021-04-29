package com.example.reciclachile

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.core.app.ActivityCompat
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*

lateinit var mAdView : AdView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.apply {
            setDisplayShowHomeEnabled(true)
            // Set whether to display the activity logo rather than the
            // activity icon. A logo is often a wider, more detailed image.
            setDisplayUseLogoEnabled(true)
            // Set the logo to display in the 'home' section of the action bar.
            setLogo(R.drawable.ecochilelogo)
        }

        MobileAds.initialize(this) {}

        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        clickMapa()

        clickAcercade()

        comoReciclar()

        TextoHome()


    }



    private fun clickMapa(){
        btnmapa.setOnClickListener(){
            val ventanaMapa = Intent(applicationContext, mapa_Santiago::class.java)
            startActivity(ventanaMapa)
        }
    }

    private fun comoReciclar(){
        btnReciclar.setOnClickListener(){
            val reciclar = Intent(applicationContext, ComoReciclarActivity::class.java)
            startActivity(reciclar)
        }
    }

    private fun clickAcercade(){
        btnAD.setOnClickListener(){
            val ventanaAcercade = Intent(applicationContext, Acercade_Activity::class.java)
            startActivity(ventanaAcercade)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){

            R.id.help->{
                Help()
                return true
            }

            R.id.Salir->{
                Salir()
                return true
            }
            else -> false
        }

        return super.onOptionsItemSelected(item)
    }

    private fun Help(){
        Toast.makeText(applicationContext,"Ayuda", Toast.LENGTH_SHORT).show()
        val helpact = Intent(applicationContext, help_Activity::class.java)
        startActivity(helpact)
    }

    private fun Salir(){
        Toast.makeText(applicationContext,"Salir", Toast.LENGTH_SHORT).show()
    }

    private fun TextoHome(){

        var num = (0..10).random();

        when (num) {
            0 -> textoAccion.setText("• Accion 0")
            1 -> textoAccion.setText("• Accion 1")
            2 -> textoAccion.setText("• Accion 2")
            3 -> textoAccion.setText("• Accion 3")
            4 -> textoAccion.setText("• Accion 4")
            5 -> textoAccion.setText("• Accion 5")
            6 -> textoAccion.setText("• Accion 6")
            7 -> textoAccion.setText("• Accion 7")
            8 -> textoAccion.setText("• Accion 8")
            9 -> textoAccion.setText("• Accion 9")
            10 -> textoAccion.setText("• Accion 10")
        }


    }

}