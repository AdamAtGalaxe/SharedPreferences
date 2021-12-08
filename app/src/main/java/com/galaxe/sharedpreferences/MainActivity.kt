package com.galaxe.sharedpreferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.textclassifier.TextClassifierEvent
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var lang: EditText

    lateinit var btn1: Button
    lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        lang = findViewById(R.id.language)
        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)

        btn1.setOnClickListener(View.OnClickListener {

            var n = name.text.toString()
            var l = lang.text.toString()


            var sharedPref : SharedPreferences = this.getSharedPreferences("Myfile", Context.MODE_PRIVATE)
            var sfedit : SharedPreferences.Editor = sharedPref.edit()

            sfedit.putString("name", n)
            sfedit.putString("lang", l)

            sfedit.commit()
        })
        btn2.setOnClickListener(View.OnClickListener {
            intent = Intent( this, Activity2::class.java)
            startActivity(intent)

        })
    }
}