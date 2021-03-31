package com.example.reciclachile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickMapa()

        clickAcercade()

    }

    private fun clickMapa(){
        btnmapa.setOnClickListener(){
            val ventanaMapa = Intent(applicationContext, mapa_Santiago::class.java)
            startActivity(ventanaMapa)
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
        Toast.makeText(applicationContext,"Help", Toast.LENGTH_SHORT).show()
    }

    private fun Salir(){
        Toast.makeText(applicationContext,"Salir", Toast.LENGTH_SHORT).show()
    }

}