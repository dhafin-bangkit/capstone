package com.example.benerin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.benerin.R
import com.example.benerin.data.Bengkel
import com.example.benerin.ui.dashboard.DashboardFragment

class BengkelAdapter(private val listItem : List<Bengkel>)
    : RecyclerView.Adapter<BengkelAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNamaBengkel : TextView = view.findViewById(R.id.nama_bengkel)
        val ivFotoBengkel : ImageView = view.findViewById(R.id.foto_bengkel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_bengkel, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvNamaBengkel.text = listItem[position].namaBengkel
        Glide.with(holder.ivFotoBengkel)
            .load(listItem[position].fotoUrl)
            .into(holder.ivFotoBengkel)


    }

    override fun getItemCount(): Int = listItem.size
}