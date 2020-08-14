package com.example.convertertest

import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.r_view_currency.view.*

class RViewAdapter(val onClickListener: OnClickListener) : RecyclerView.Adapter<RViewAdapter.AdapterView>() {

    val list = listOf("USD - Доллар США", "AUD - Австралийский доллар", "BYN - Белорусский рубль", "DKK - Датских крон", "EUR - Евро", "CAD - Канадский доллар")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterView {
        return AdapterView(
            LayoutInflater.from(parent.context).inflate(R.layout.r_view_currency, parent, false)
        )
    }

    override fun getItemCount(): Int = 6

    override fun onBindViewHolder(holder: AdapterView, position: Int) {

        holder.itemView.text_rv.text = list[position]

    }



    interface OnClickListener{
        fun clickN(data: String)
    }

    class AdapterView(view: View) : RecyclerView.ViewHolder(view) {

    }
}