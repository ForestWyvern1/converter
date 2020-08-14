package com.example.convertertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_converter.*

class ConverterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)

        bn.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.convert ->{
                    cardview.visibility = View.VISIBLE
                    cardviewq.visibility = View.GONE
                    text.visibility = View.VISIBLE
                    textq.visibility = View.GONE
                }
                R.id.settings -> {
                    cardview.visibility = View.GONE
                    cardviewq.visibility = View.VISIBLE
                    text.visibility = View.GONE
                    textq.visibility = View.VISIBLE
                }
            }
            true
        }

        changelanguage.setOnClickListener {

        }

        info.setOnClickListener {

        }

        rus.setOnClickListener {
            toChange()
        }

        usd.setOnClickListener {
            toChange()
        }

    }

    fun toChange() {
        startActivity(Intent(this, ChangeCurrencyActivity::class.java))
    }

    override fun onBackPressed() {
        finishAffinity()
    }
}