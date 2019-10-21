package com.example.viewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mAdapter: DataListAdapter = DataListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = mAdapter
        createData()
    }

    private fun createData() {
        val models: MutableList<DataModel> = arrayListOf()
        for(i in 1..10000) {
            models.add(DataModel("Title $i", "Description $i"))
        }
        mAdapter.setData(models)
    }
}
