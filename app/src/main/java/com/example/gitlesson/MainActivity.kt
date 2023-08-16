package com.example.gitlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun newFeature() {
        Toast.makeText(this,"hello", Toast.LENGTH_SHORT).show()
    }

    private fun secondFeature() {
        println("Fuck")
    }

    private fun myFoo() {
        println("Hello there")
    }

}