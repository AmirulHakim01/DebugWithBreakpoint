package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.debugging.R


public val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        division()
    }

    fun division() {
        val numerator = 60
        var denominator = 4
        repeat(5) {
            println(numerator)
           // Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }

}