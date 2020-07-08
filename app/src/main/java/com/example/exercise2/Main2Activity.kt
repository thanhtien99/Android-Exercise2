package com.example.exercise2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.relative_layout.*

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout)
        buttonBackLinner.setOnClickListener { var intent: Intent = Intent (this,MainActivity::class.java)
            startActivity(intent) }

    }
}