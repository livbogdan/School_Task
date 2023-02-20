package com.i3ogdan.school_task

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnNavigate: Button = findViewById(R.id.btn)
        val iNav = Intent(this, MainActivity::class.java)

        btnNavigate.setOnClickListener{
            println("does push")
            startActivity(iNav)
        }
    }
}