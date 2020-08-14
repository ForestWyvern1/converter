package com.example.convertertest

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.list.listItemsSingleChoice
import kotlinx.android.synthetic.main.settings_fragment.*

class SettingsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.settings_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        changelanguage.setOnClickListener {

        }

        info.setOnClickListener {
//            Toast.makeText(activity, "вас успешно взломали", Toast.LENGTH_SHORT).show()
            MaterialDialog(requireActivity())
                .title(text = "Взломан нафиг")
                .listItemsSingleChoice(
                    items = listOf("Заплатить 300$", "Отдать хату", "Кекс"),
                        selection = { dialog, i, text ->
                        when (i) {
                            0 -> Toast.makeText(activity, "Заплатить 300$", Toast.LENGTH_SHORT).show()
                            1 -> Toast.makeText(activity, "Отдать хату", Toast.LENGTH_SHORT).show()
                            else -> Toast.makeText(activity, "Кекс", Toast.LENGTH_SHORT).show()
                        }
                        dialog.cancel()
                    })
                .title(text = "Select color")
                .show { }
        }
    }
}