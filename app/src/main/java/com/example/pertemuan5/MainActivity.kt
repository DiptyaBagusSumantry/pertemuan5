package com.example.pertemuan5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pertemuan5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter : MyContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("20102281", "Diptya Bagus Sumantry", "08515762325"),
            MyContact("20102281", "Diptya Bagus Sumantry", "08515762325"),
            MyContact("20102281", "Diptya Bagus Sumantry", "08515762325"),
            MyContact("20102281", "Diptya Bagus Sumantry", "08515762325"),
            MyContact("20102281", "Diptya Bagus Sumantry", "08515762325"),
            MyContact("20102281", "Diptya Bagus Sumantry", "08515762325"),
            MyContact("20102281", "Diptya Bagus Sumantry", "08515762325"),
            MyContact("20102281", "Diptya Bagus Sumantry", "08515762325"),
            MyContact("20102281", "Diptya Bagus Sumantry", "08515762325"),

        )

        adapter = MyContactAdapter(listStudent)

        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}