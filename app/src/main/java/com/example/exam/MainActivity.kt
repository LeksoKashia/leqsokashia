package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private  lateinit var ki: CheckBox
    private  lateinit var ara: CheckBox
    private  lateinit var vaqcina: EditText
    private lateinit var gagzavna1: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ki = findViewById(R.id.ki)
        ara = findViewById(R.id.ara)
        vaqcina= findViewById(R.id.vaqcina)
        gagzavna1= findViewById(R.id.gagzavna1)

        gagzavna1.setOnClickListener{
            val ki1 = ki
            val ara1 = ara
            val vaqcina1 = vaqcina.text.toString()
            val gagzavna11 = gagzavna1.text.toString()

            if (ki1.isChecked and vaqcina1.isEmpty()){
                vaqcina.error = "შეიყვანეთ ვაქცინის დასახელება"
                return@setOnClickListener

        }   else if (ki1.isChecked and ara1.isChecked) {
                ki.error = "მონიშნეთ ერთადერთი"
                return@setOnClickListener

            }else if (ara1.isChecked and vaqcina1.isNotEmpty()){
                Toast.makeText(this, "თქვენ არ ხართ ვაქცინირებული", Toast.LENGTH_SHORT).show()
            }



        }


    }



}