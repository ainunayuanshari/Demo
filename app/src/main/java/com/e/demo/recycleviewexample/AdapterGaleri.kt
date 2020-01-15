package com.e.demo.recycleviewexample


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide

import com.e.demo.R
import com.e.demo.maps.MapsActivity
import kotlinx.android.synthetic.main.item_adapter_galeri.view.*

class AdapterGaleri (private val daftarGambar: List<String>):RecyclerView.Adapter<AdapterGaleri.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //kalau adapter memakai (LayoutInflater.from(parent.context).inflate())
        return ViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_adapter_galeri, parent, false)

        )
    }

    override fun getItemCount(): Int {
        return daftarGambar.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //val progress=CircularProgressDrawable(holder.itemView.context)
    Glide.with(holder.itemView.context).load(daftarGambar.get(position))
        .into(holder.gambar)
        holder.itemView.setOnClickListener() {
        //    Toast.makeText(holder.itemView.context,daftarGambar.get(position),
            //    Toast.LENGTH_SHORT).show()
            val detail=Intent(holder.itemView.context, MapsActivity::class.java)
            detail.putExtra("judul","lauwba tecno indonesia")
            detail.putExtra("deskripsi","Deskripsi lauwba techno indonesia")
            detail.putExtra("lat",-5.0905504)
            detail.putExtra("lon", 119.5133506)
            holder.itemView.context.startActivity(detail)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val gambar= itemView.gambarGaleri


    }

}