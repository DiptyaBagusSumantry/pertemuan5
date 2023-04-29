package com.example.pertemuan5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pertemuan5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact(
                "20102281",
                "Diptya Bagus Sumantry",
                "08515762325",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqznPgoLaCnes0gLCO7QMbcnAy_UYpc0481g&usqp=CAU"
            ),
            MyContact(
                "20102281",
                "Diptya Bagus Sumantry",
                "08515762325",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqznPgoLaCnes0gLCO7QMbcnAy_UYpc0481g&usqp=CAU"
            ),
            MyContact(
                "20102281",
                "Diptya Bagus Sumantry",
                "08515762325",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqznPgoLaCnes0gLCO7QMbcnAy_UYpc0481g&usqp=CAU"
            ),
            MyContact(
                "20102281",
                "Diptya Bagus Sumantry",
                "08515762325",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqznPgoLaCnes0gLCO7QMbcnAy_UYpc0481g&usqp=CAU"
            ),
            MyContact(
                "20102281",
                "Diptya Bagus Sumantry",
                "08515762325",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqznPgoLaCnes0gLCO7QMbcnAy_UYpc0481g&usqp=CAU"
            ),
            MyContact(
                "20102281",
                "Diptya Bagus Sumantry",
                "08515762325",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqznPgoLaCnes0gLCO7QMbcnAy_UYpc0481g&usqp=CAU"
            ),
            MyContact(
                "20102281",
                "Diptya Bagus Sumantry",
                "08515762325",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqznPgoLaCnes0gLCO7QMbcnAy_UYpc0481g&usqp=CAU"
            ),
            MyContact(
                "20102281",
                "Diptya Bagus Sumantry",
                "08515762325",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqznPgoLaCnes0gLCO7QMbcnAy_UYpc0481g&usqp=CAU"
            ),
        )
        gridView(listStudent)
    }

    private  fun  listView(value: ArrayList<MyContact>){
        val adapter= ListViewAdapter(this,value)
        val  layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager=layoutManager
        binding.rvContact.adapter=adapter

    }
    private fun  gridView(value: ArrayList<MyContact>){
        val adapter= GridViewAdapter(this,value)
        val  layoutManager= GridLayoutManager(this,2, LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager=layoutManager
        binding.rvContact.adapter=adapter
    }
    private fun  cardView(value: ArrayList<MyContact>){
        val adapter= CardViewAdapter(this,value)
        val  layoutManager=LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager=layoutManager
        binding.rvContact.adapter=adapter
    }

}