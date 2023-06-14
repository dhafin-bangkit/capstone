package com.example.benerin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.benerin.R
import com.example.benerin.data.ServiceKendaraan

class ServiceAdapter(private val listItem : List<ServiceKendaraan>) : RecyclerView.Adapter<ServiceAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNamaService: TextView = view.findViewById(R.id.nama_bengkel)
        val ivFotoService: ImageView = view.findViewById(R.id.foto_bengkel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ServiceAdapter.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_bengkel, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvNamaService.text = listItem[position].namaService
        Glide.with(holder.ivFotoService)
            .load(listItem[position].fotoUrl)
            .into(holder.ivFotoService)
    }

    override fun getItemCount(): Int = listItem.size
}