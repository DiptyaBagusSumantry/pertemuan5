package com.example.pertemuan5

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pertemuan5.databinding.ListviewLayoutBinding


class ListViewAdapter(private val context: Context, private val listStudent : ArrayList<MyContact>): RecyclerView.Adapter<ListViewAdapter.ViewHolder>() {
    class ViewHolder(val binding : ListviewLayoutBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=ListviewLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }
    override fun getItemCount(): Int {
        return listStudent.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvNim.text=listStudent[position].nim
        holder.binding.tvNama.text=listStudent[position].nama
        holder.binding.tvNomorTelepon.text=listStudent[position].nomorTelepon
        holder.binding.itemView.setOnClickListener {
            val intent= Intent(context,DetailActivity::class.java)
            intent.putExtra("nim",listStudent[position].nim)
            intent.putExtra("nama",listStudent[position].nama)
            intent.putExtra("telepon",listStudent[position].nomorTelepon)
            intent.putExtra("foto",listStudent[position].foto)
            context.startActivity(intent)
        }
    }
}