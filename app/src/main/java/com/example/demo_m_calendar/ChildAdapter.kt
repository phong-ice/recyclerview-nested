package com.example.demo_m_calendar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo_m_calendar.databinding.ItemChildBinding

class ChildAdapter : RecyclerView.Adapter<ChildAdapter.ViewHolder>() {

    private val listColor = arrayListOf<Int>()

    init {
        listColor.addAll(MainActivity.LIST_COLOR.shuffled())
    }

    inner class ViewHolder(private val binding: ItemChildBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.view.setBackgroundColor(listColor[position])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemChildBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = listColor.size
}