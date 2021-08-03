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
                    "• Plastico" -> photo.setImageResource(R.drawable.btnplastico)
                    "• Carton" -> photo.setImageResource(R.drawable.btncartones)
                    "• Papel" -> photo.setImageResource(R.drawable.btncartones)
                    "• Bateria/Pila" -> photo.setImageResource(R.drawable.btnpila)
                    "• Aluminio/Hojalata" -> photo.setImageResource(R.drawable.btnaluminio)
                    "• Vidrio" -> photo.setImageResource(R.drawable.btnvidrio)
                }

                when (item) {
                    "Selecciona Tipo:" -> con.setImageResource(R.drawable.logohome)
                    "• Plastico" -> con.setImageResource(R.drawable.plasticof)
                    "• Carton" -> con.setImageResource(R.drawable.papelcartonf)
                    "• Papel" -> con.setImageResource(R.drawable.papelcartonf)
                    "• Bateria/Pila" -> con.setImageResource(R.drawable.pilaf)
                    "• Aluminio/Hojalata" -> con.setImageResource(R.drawable.aluminiof)
                    "• Vidrio" -> con.setImageResource(R.drawable.vidriof)
                }

                when (item) {
                    "Selecciona Tipo:" -> textocolor.setText("* Selecciona un Tipo de Residuo :) *")
                    "• Plastico" -> textocolor.setText("Generalmente corresponde al color Amarillo")
                    "• Carton" -> textocolor.setText("Generalmente corresponde al color Azul")
                    "• Papel" -> textocolor.setText("Generalmente corresponde al color Azul")
                    "• Bateria/Pila" -> textocolor.setText("Generalmente corresponde al color Rojo")
                    "• Aluminio/Hojalata" -> textocolor.setText("Generalmente corresponde al color Gris o Negro")
                    "• Vidrio" -> textocolor.setText("Generalmente corresponde al color Verde")
                }

                when (item) {
                    "Selecciona Tipo:" -> textoejemplo.setText("")
                    "• Plastico" -> textoejemplo.setText("• Ejemplos: Botellas de bebida, Agua y de jugo Desechables, Envases de Shampoo y Jabón de Aseo, Bolsas de Plástico Tipo Camiseta, Bolsas de Papel Higiénico, Bolsas de Alimentos Congelados, Bolsas de Packs de Cervezas.")
                    "• Carton" -> textoejemplo.setText("• Ejemplo: Cartón Corrugado, Carton Liso, Cartones de Uso Escolar.")
                    "• Papel" -> textoejemplo.setText("• Ejemplo: Papel de Impresora, Papel Kraft, Papel de Diario, Revistas, Sobres de Papel.")
                    "• Bateria/Pila" -> textoejemplo.setText("• Las pilas son peligrosas para nuestro medio ambiente, ya que una sola pila puede contaminar miles de litros de agua, ya sean de reloj o las convencionales, al estar compuestas por elementos tóxicos para nosotros y los animales.")
                    "• Aluminio/Hojalata" -> textoejemplo.setText("• Ejemplo: Bebidas, Cervezas, Jugos, Energéticas, Bandejas de Alumínio, Tarros de Café, Tarros de Crema, Alimentos en Conserva, Entre otros.")
                    "• Vidrio" -> textoejemplo.setText("• Ejemplo: Frascos de Vidrio usados para Mermeladas, Miel, Frutas, Café, entre Otros.")
                }

                when (item) {
                    "Selecciona Tipo:" -> btninfo.isEnabled = false

                    "• Plastico" -> {
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                            val ventana = Intent(applicationContext, reciclar_plastico::class.java)
                            startActivity(ventana)
                        }

                    }

                    "• Carton" -> {
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                            val ventanaMapa = Intent(applicationContext, reciclar_papeles_cartones::class.java)
                            startActivity(ventanaMapa)
                        }
                    }

                    "• Papel" -> {
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                        val ventanaMapa = Intent(applicationContext, reciclar_papeles_cartones::class.java)
                        startActivity(ventanaMapa)
                        }
                    }

                    "• Bateria/Pila" ->{
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                            val ventanaMapa = Intent(applicationContext, reciclar_pilas_tapas::class.java)
                            startActivity(ventanaMapa)
                        }
                    }

                    "• Aluminio/Hojalata" -> {
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                            val ventanaMapa = Intent(applicationContext, reciclar_aluminio::class.java)
                            startActivity(ventanaMapa)
                        }
                    }

                    "• Vidrio" -> {
                        btninfo.isEnabled = true
                        btninfo.setOnClickListener(){
                            val ventanaMapa = Intent(applicationContext, reciclar_vidrio::class.java)
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