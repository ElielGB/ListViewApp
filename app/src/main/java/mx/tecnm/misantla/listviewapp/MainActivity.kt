package mx.tecnm.misantla.listviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas : ArrayList<String> = ArrayList()
        frutas.add("Manzana")
        frutas.add("Plátano")
        frutas.add("Limón")
        frutas.add("Uva")
        frutas.add("Kiwi")
        frutas.add("Mango")
        frutas.add("Naranja")
        frutas.add("Fresa")
        frutas.add("Sandía")

        val opcion = 0
        val lista = findViewById<ListView>(R.id.lista)

        val adaptador = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,frutas)

        lista.adapter= adaptador

        lista.setOnItemClickListener { parent: AdapterView<*>, view: View, opcion: Int, id: Long ->


            if(opcion==0){
                val myIntent = Intent(view.context, AppleActivity::class.java)
                startActivity(myIntent)
            }

            else if(opcion==1){
                val myIntent = Intent(view.context, PlatanoActivity::class.java)
                startActivity(myIntent)
            }

            else if(opcion==2){
                val myIntent = Intent(view.context, LimonActivity::class.java)
                startActivity(myIntent)
            }

            else if(opcion==3){
                val myIntent = Intent(view.context, UvaActivity::class.java)
                startActivity(myIntent)
            }

            else if(opcion==4){
                val myIntent = Intent(view.context, KiwiActivity::class.java)
                startActivity(myIntent)
            }

            else if(opcion==5){
                val myIntent = Intent(view.context, MangoActivity::class.java)
                startActivity(myIntent)
            }

            else if(opcion==6){
                val myIntent = Intent(view.context, NaranjaActivity::class.java)
                startActivity(myIntent)
            }

            else if(opcion==7){
                val myIntent = Intent(view.context, FresaActivity::class.java)
                startActivity(myIntent)
            }

            else if(opcion==8){
                val myIntent = Intent(view.context, SandiaActivity::class.java)
                startActivity(myIntent)
            }

        }



    }
}