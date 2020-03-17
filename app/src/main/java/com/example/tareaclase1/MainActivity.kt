package com.example.tareaclase1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var nn1 = Random.nextInt(0,10)
    var nn2 = Random.nextInt(0,10)
    var toastMessage = ""
    val duration = Toast.LENGTH_SHORT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = findViewById(R.id.button1) as Button
        val boton2 = findViewById(R.id.button2) as Button

        boton1.setText(nn1.toString())
        boton2.setText(nn2.toString())

        boton1.setOnClickListener {
            check(nn1,nn2)
            restart(boton1,boton2)
        }


        boton2.setOnClickListener {
            check(nn2,nn1)
            restart(boton1,boton2)
        }


    }
    fun check(n1:Int, n2:Int)
    {

        if (n1 > n2){
            toastMessage = "Muy bien"
        }
        else if ( n1==n2){
            toastMessage = "Iguales"
        }
        else{
            toastMessage = "Muy mal"
        }
        val toast = Toast.makeText(this,toastMessage,duration)
        toast.show()
    }

    fun restart(b1:Button,b2:Button){
        nn1 =  Random.nextInt(0,10)
        b1.setText(nn1.toString())
        nn2 =  Random.nextInt(0,10)
        b2.setText(nn2.toString())
    }


}
