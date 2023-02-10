package com.example.demo_m_calendar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demo_m_calendar.databinding.ItemParentBinding

class ParentAdapter : RecyclerView.Adapter<ParentAdapter.ViewHolder>() {

    private val listParent = arrayListOf<String>()

    fun setChildren(names: List<String>) {
        listParent.clear()
        listParent.addAll(names)
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemParentBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.tvName.text = listParent[position]
            binding.rvChildren.adapter = ChildAdapter()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemParentBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = listParent.size
}