package com.example.convertertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_converter.*

class ConverterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)

        openConverterFragment()

        bn.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.convert -> {
                    openConverterFragment()
                }
                R.id.settings -> {
                    openSettingsFragment()
                }
            }
            true
        }
    }

    fun toChange() {
        startActivity(Intent(this, ChangeCurrencyActivity::class.java))
    }

    override fun onBackPressed() {
        finishAffinity()
    }

    fun changeFragment(fmt: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_holder, fmt).addToBackStack(null).commit()
    }

    fun openConverterFragment(){
        changeFragment(ConvertFragment())
    }
    fun openSettingsFragment(){
        changeFragment(SettingsFragment())
    }
}