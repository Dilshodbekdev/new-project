package com.example.viewgroup

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DataListAdapter : RecyclerView.Adapter<DataViewHolder>() {

    var models: List<DataModel> = emptyList()

    fun setData(models: List<DataModel>) {
        this.models = models
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return DataViewHolder(view)
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bindModel(models[position])
    }
}