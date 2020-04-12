package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun testUpload(){
        val a :Int = 3
        val b:Int = 6
        val result: Int = a +b
        val resultBy: Int = a*b
    }
}
