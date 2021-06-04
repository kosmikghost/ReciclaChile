package com.example.reciclachile

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import android.widget.ViewFlipper
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

        Contenedor()

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

    private fun Contenedor(){
        btnContenedores.setOnClickListener(){
            val contenedores = Intent(applicationContext, contenedores::class.java)
            startActivity(contenedores)
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

        var num = (0..11).random();

        when (num) {
            0 -> textoAccion.setText("No botes tu basura en las calles, busca un basurero o guarda tu basura hasta llegar a uno, comparte el hábito de cuidar nuestro entorno con otros \uD83D\uDEAE️")
            1 -> textoAccion.setText("☀ Aprovecha la luz Ambiental ☀")
            2 -> textoAccion.setText("Utiliza ampolletas led y de bajo consumo \uD83D\uDCA1️")
            3 -> textoAccion.setText("Usa bicicleta, es un medio de transporte limpio libre de contaminación, así evitas contaminantes que las micros y automóviles generan \uD83D\uDEB2️")
            4 -> textoAccion.setText("Recuerda utilizar bolsas reutilizables cuando vayas de compras. Evita utilizar el plástico ♻️️")
            5 -> textoAccion.setText("CONSUMO FANTASMA, evita dejar aparatos eléctricos que no utilices enchufados, esto ahorrará consumo eléctrico \uD83D\uDD0C")
            6 -> textoAccion.setText("\uD83C\uDF33 Planta un Árbol \uD83C\uDF33")
            7 -> textoAccion.setText("Separa los residuos y enseña a reciclar ♻")
            8 -> textoAccion.setText("Consume frutas y verduras ecológicas, los productos ecológicos cuidan el medio ambiente \uD83C\uDF4F")
            9 -> textoAccion.setText("Aprende a reciclar en EcoChile y deja tu comentario sobre nuestra aplicación, mejoraremos gracias a ustedes :)")
            10 -> textoAccion.setText("Cierra la llave mientras te lavas los dientes \uD83D\uDEB0")
            11 -> textoAccion.setText("Cuidemos nuestro planeta para las futuras generaciones \uD83C\uDF0E")
        }


    }

}