package com.example.convertertest

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.conver_fragment.*

class ConvertFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.conver_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rus.setOnClickListener {
            toCurency()
        }

        usd.setOnClickListener {
            toCurency()
        }

    }

    fun toCurency() {
        startActivity(Intent(activity, ChangeCurrencyActivity::class.java))
    }


}
