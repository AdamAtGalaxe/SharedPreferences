package com.galaxe.sharedpreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class Activity2 : AppCompatActivity() {

    lateinit var txt: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        txt = findViewById(R.id.tv)
        var sharedPref : SharedPreferences = this.getSharedPreferences("Myfile", Context.MODE_PRIVATE)

        var n =sharedPref.getString("name", "N/A")
        var l = sharedPref.getString("lang", "N/A")

        txt.setText("Hello $n and your preferred language is $l")
    }
}