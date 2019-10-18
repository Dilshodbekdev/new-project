package com.example.viewgroup

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_bottom.*

class BottomFragment : Fragment(R.layout.fragment_bottom) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            (activity as MainActivity).buttonClicked()
        }
    }
}