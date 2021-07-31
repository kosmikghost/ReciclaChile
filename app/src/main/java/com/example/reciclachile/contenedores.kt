package com.piratedog.reciclachile

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_contenedores.*
import kotlinx.android.synthetic.main.activity_main.*

class contenedores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contenedores)

        supportActionBar?.apply {
            title = ""
            setDisplayShowHomeEnabled(true)
            // Set whether to display the activity logo rather than the
            // activity icon. A logo is often a wider, more detailed image.
            setDisplayUseLogoEnabled(true)
            // Set the logo to display in the 'home' section of the action bar.
            setLogo(R.drawable.ecochilelogo)
        }

        TipoMaterial()

    }

    private fun TipoMaterial(){

        val spinner: Spinner = findViewById(R.id.spinner)


        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {


                var item = parent?.getItemAtPosition(position).toString();

                when (item) {
                    "Selecciona Tipo:" -> photo.setImageResource(R.drawable.contenedores)
                    "Plastico" -> photo.setImageResource(R.drawable.btnplastico)
                    "Carton" -> photo.setImageResource(R.drawable.btncartones)
                    "Papel" -> photo.setImageResource(R.drawable.btncartones)
                    "Bateria/Pila" -> photo.setImageResource(R.drawable.btnpila)
                    "Aluminio" -> photo.setImageResource(R.drawable.btnaluminio)
                    "Vidrio" -> photo.setImageResource(R.drawable.btnvidrio)
                    "Chatarra" -> photo.setImageResource(R.drawable.btnchatarra)
                }

                when (item) {
                    "Selecciona Tipo:" -> con.setImageResource(R.drawable.logohome)
                    "Plastico" -> con.setImageResource(R.drawable.plasticof)
                    "Carton" -> con.setImageResource(R.drawable.papelcartonf)
                    "Papel" -> con.setImageResource(R.drawable.papelcartonf)
                    "Bateria/Pila" -> con.setImageResource(R.drawable.pilaf)
                    "Aluminio" -> con.setImageResource(R.drawable.aluminiof)
                    "Vidrio" -> con.setImageResource(R.drawable.vidriof)
                    "Chatarra" -> con.setImageResource(R.drawable.chatarraf)
                }

                when (item) {
                    "Selecciona Tipo:" -> textocolor.setText("* Color de Residuo *")
                    "Plastico" -> textocolor.setText("Generalmente corresponde al color Amarillo")
                    "Carton" -> textocolor.setText("Generalmente corresponde al color Azul")
                    "Papel" -> textocolor.setText("Generalmente corresponde al color Azul")
                    "Bateria/Pila" -> textocolor.setText("Generalmente corresponde al color Rojo")
                    "Aluminio" -> textocolor.setText("Generalmente corresponde al color Gris")
                    "Vidrio" -> textocolor.setText("Generalmente corresponde al color Verde")
                    "Chatarra" -> textocolor.setText("Generalmente corresponde al color Gris")
                }

                when (item) {
                    "Selecciona Tipo:" -> btninfo.isEnabled = false

                    "Plastico" -> {
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                            val ventana = Intent(applicationContext, reciclar_plastico::class.java)
                            startActivity(ventana)
                        }

                    }

                    "Carton" -> {
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                            val ventanaMapa = Intent(applicationContext, reciclar_papeles_cartones::class.java)
                            startActivity(ventanaMapa)
                        }
                    }

                    "Papel" -> {
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                        val ventanaMapa = Intent(applicationContext, reciclar_papeles_cartones::class.java)
                        startActivity(ventanaMapa)
                        }
                    }

                    "Bateria/Pila" ->{
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                            val ventanaMapa = Intent(applicationContext, reciclar_pilas_tapas::class.java)
                            startActivity(ventanaMapa)
                        }
                    }

                    "Aluminio" -> {
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                            val ventanaMapa = Intent(applicationContext, reciclar_aluminio::class.java)
                            startActivity(ventanaMapa)
                        }
                    }

                    "Vidrio" -> {
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                            val ventanaMapa = Intent(applicationContext, reciclar_vidrio::class.java)
                            startActivity(ventanaMapa)
                        }
                    }

                    "Chatarra" -> {
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                            val ventanaMapa = Intent(applicationContext, reciclar_chatarra::class.java)
                            startActivity(ventanaMapa)
                        }
                    }
                }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }



}