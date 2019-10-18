package com.example.viewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_top.*

class MainActivity : AppCompatActivity() {

    private var text: String = ""
    private var topFragment: TopFragment = TopFragment()
    private var bottomFragment: BottomFragment = BottomFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openFragment(R.id.topFragmentContainer, topFragment)
        openFragment(R.id.bottomFragmentContainer, bottomFragment)
    }

    private fun openFragment(containerResId: Int, fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .add(containerResId, fragment)
            .commit()
    }

    fun buttonClicked() {
        text = topFragment.editText.text.toString()
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}
