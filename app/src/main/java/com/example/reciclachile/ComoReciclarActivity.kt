package com.example.reciclachile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_como_reciclar.*
import kotlinx.android.synthetic.main.activity_main.*

class ComoReciclarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_como_reciclar)

        supportActionBar?.apply {
            title = ""
            setDisplayShowHomeEnabled(true)
            // Set whether to display the activity logo rather than the
            // activity icon. A logo is often a wider, more detailed image.
            setDisplayUseLogoEnabled(true)
            // Set the logo to display in the 'home' section of the action bar.
            setLogo(R.drawable.ecochilelogo)
        }

        clickPlastico()

        clickVidrio()

        clickPapeles()

        clickChatarra()

        clickAluminio()

        clickPilaTapa()
    }

    private fun clickPlastico(){
        btnPlastico.setOnClickListener(){
            val plastico = Intent(applicationContext, reciclar_plastico::class.java)
            startActivity(plastico)
        }
    }

    private fun clickVidrio(){
        btnvidrio.setOnClickListener(){
            val vidrio = Intent(applicationContext, reciclar_vidrio::class.java)
            startActivity(vidrio)
        }
    }

    private fun clickPapeles(){
        btnPapeles.setOnClickListener(){
            val papel = Intent(applicationContext, reciclar_papeles_cartones::class.java)
            startActivity(papel)
        }
    }

    private fun clickChatarra(){
        btnChatarra.setOnClickListener(){
            val chatarra = Intent(applicationContext, reciclar_chatarra::class.java)
            startActivity(chatarra)
        }
    }

    private fun clickAluminio(){
        btnAluminio.setOnClickListener(){
            val aluminio = Intent(applicationContext, reciclar_aluminio::class.java)
            startActivity(aluminio)
        }
    }

    private fun clickPilaTapa(){
        btnPila.setOnClickListener(){
            val pila = Intent(applicationContext, reciclar_pilas_tapas::class.java)
            startActivity(pila)
        }
    }
}