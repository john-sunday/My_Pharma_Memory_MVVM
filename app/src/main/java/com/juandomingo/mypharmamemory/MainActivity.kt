package com.juandomingo.mypharmamemory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(3000)
        setTheme(R.style.Theme_MyPharmaMemory2)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}