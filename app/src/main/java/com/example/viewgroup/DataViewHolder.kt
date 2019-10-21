package com.example.viewgroup

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
    private val tvDescription: TextView = itemView.findViewById(R.id.tvDescription)

    fun bindModel(model: DataModel) {
        tvTitle.text = model.title
        tvDescription.text = model.description
    }
}