package com.example.convertertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_change_currency.*

class ChangeCurrencyActivity : AppCompatActivity(), RViewAdapter.OnClickListener {

    override fun clickN(data: String){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_currency)

        searchbar.setOnClickListener {
            search.visibility = View.VISIBLE
            searchbar.visibility = View.GONE
        }

        arrowback.setOnClickListener {
            super.onBackPressed()
        }

        searchb.setOnClickListener {
            search.visibility = View.GONE
            searchbar.visibility = View.VISIBLE
        }

        currency_rv.layoutManager = LinearLayoutManager (this)
        currency_rv.adapter = RViewAdapter (this)
    }
}