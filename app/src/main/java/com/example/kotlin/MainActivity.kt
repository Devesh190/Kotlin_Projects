package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private lateinit var tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.mb_roll)
        tv = findViewById(R.id.tv)

        btn.setOnClickListener{ rollDice()}

    }

    private fun rollDice() {
        var randomNum = (1..6).random()
        tv.text = randomNum.toString()
    }
}