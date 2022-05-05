package com.example.app1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            TV_RESULTADO.setOnClickListener(){
                mensagem()

            }


    }
    fun mensagem (){

    val MSG = EDT_MSG.text.toString();

        TV_RESULTADO.text=MSG;

        }

}


