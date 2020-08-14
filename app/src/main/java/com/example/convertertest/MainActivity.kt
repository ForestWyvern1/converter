package com.example.convertertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        skip.setOnClickListener {
            toConverter()
        }

        next.setOnClickListener {
            skip.visibility = View.GONE
            next.visibility = View.GONE
            letsgo.visibility = View.VISIBLE
            dots.visibility = View.GONE
            dotsq.visibility = View.VISIBLE
        }

        letsgo.setOnClickListener {
            toConverter()
        }

    }

    fun toConverter() {
        startActivity(Intent(this, ConverterActivity::class.java))
    }
}