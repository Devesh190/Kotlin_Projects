package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
     lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnAdd.setOnClickListener(this)
        binding.btnSubtraction.setOnClickListener(this)
        binding.btnMultiplication.setOnClickListener(this)
        binding.btnDividion.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var a = binding.edA.text.toString().toDouble()
        var b = binding.edB.text.toString().toDouble()
        var result:Double = 0.0

        when(v?.id){
            R.id.btn_add -> {
                result = a+b
            }
            R.id.btn_subtraction -> {
                result = a-b
            }
            R.id.btn_multiplication -> {
                result = a*b
            }
            R.id.btn_dividion -> {
                result = a/b
            }
        }

        binding.tvResult.text = "Result is $result"
    }
}