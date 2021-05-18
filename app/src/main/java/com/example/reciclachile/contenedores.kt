package com.example.reciclachile

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
        TipoPlastico()


    }

    private fun TipoMaterial(){

        val spinner: Spinner = findViewById(R.id.spinner)
        val spinner2: Spinner = findViewById(R.id.spinner2)
        spinner2.setEnabled(false)

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
                    "Aluminio" -> photo.setImageResource(R.drawable.btnpila)
                    "Vidrio" -> photo.setImageResource(R.drawable.btnpila)
                    "Chatarra" -> photo.setImageResource(R.drawable.btnpila)
                }

                if (parent?.getItemAtPosition(position).toString()=="Plastico"){
                    textocontenedor.setText("Selecciona Tipo de Plastico:")
                    spinner2.isEnabled = true
                }

                if (parent?.getItemAtPosition(position).toString()!="Plastico"){
                    textocontenedor.setText("-")
                    spinner2.setSelection(0)
                    spinner2.isEnabled = false
                }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }

    private fun TipoPlastico(){

        val spinner2: Spinner = findViewById(R.id.spinner2)
        spinner2.setEnabled(false)

        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

                var item = parent?.getItemAtPosition(position).toString();

                when (item) {
                    "Selecciona Tipo:" -> photo.setImageResource(R.drawable.contenedores)
                    "Pet / 1" -> Toast.makeText(applicationContext,"Pet / 1", Toast.LENGTH_LONG).show()
                    "HDPE / 2" -> Toast.makeText(applicationContext,"HDPE / 2", Toast.LENGTH_LONG).show()
                    "PVC / 3" -> Toast.makeText(applicationContext,"PVC / 3", Toast.LENGTH_LONG).show()
                    "LDPE / 4" -> Toast.makeText(applicationContext,"LDPE / 4", Toast.LENGTH_LONG).show()
                    "PP / 5" -> Toast.makeText(applicationContext,"PP / 5", Toast.LENGTH_LONG).show()
                    "PS / 6" -> Toast.makeText(applicationContext,"PS / 6", Toast.LENGTH_LONG).show()
                    "Otros / 7" -> Toast.makeText(applicationContext,"Otros / 7", Toast.LENGTH_LONG).show()
                }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }

}