package com.example.demo_m_calendar

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demo_m_calendar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    companion object {
        val LIST_COLOR = listOf(Color.RED, Color.BLUE, Color.GREEN, Color.DKGRAY, Color.CYAN)
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = ParentAdapter()
        binding.rvParent.adapter = adapter
        adapter.setChildren(
            listOf(
                "Recycler view 1",
                "Recycler view 2",
                "Recycler view 3",
                "Recycler view 4",
                "Recycler view 5",
                "Recycler view 6"
            )
        )
    }
}