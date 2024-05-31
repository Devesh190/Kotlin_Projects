package com.example.kotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private lateinit var iv:ImageView
    private lateinit var tv:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.mb_roll)
        iv = findViewById(R.id.iv_dice)
        tv = findViewById(R.id.tv_text)
        btn.setOnClickListener{ rollDice()}

    }

    private fun rollDice() {
        var randomNum = (1..6).random()
        tv.text = randomNum.toString()
        when(randomNum.toString()){
            "1" -> iv.setImageResource(R.drawable.dice_1)
            "2" -> iv.setImageResource(R.drawable.dice_2)
            "3" -> iv.setImageResource(R.drawable.dice_3)
            "4" -> iv.setImageResource(R.drawable.dice_4)
            "5" -> iv.setImageResource(R.drawable.dice_5)
            "6" -> iv.setImageResource(R.drawable.dice_6)
            else -> iv.setImageResource(R.drawable.empty_dice)
        }
    }
}