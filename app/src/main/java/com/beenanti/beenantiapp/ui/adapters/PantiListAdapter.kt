package com.beenanti.beenantiapp.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.beenanti.beenantiapp.R
import com.beenanti.beenantiapp.models.PantiRowsItem
import com.bumptech.glide.Glide

class PantiListAdapter(private val pantiList: ArrayList<PantiRowsItem>) :
    RecyclerView.Adapter<PantiListAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPantiImage: ImageView = itemView.findViewById(R.id.panti_card_image)
        var tvPantiName: TextView = itemView.findViewById(R.id.panti_card_name)
        var tvPantiLocation: TextView = itemView.findViewById(R.id.panti_card_location)
        var tvPantiChildren: TextView = itemView.findViewById(R.id.panti_card_childrens)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.panti_card, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return pantiList.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val name = pantiList[position].namaPanti
        val children = pantiList[position].jumlahAnak
        val location = pantiList[position].alamat
        val context = holder.itemView.context

        Glide.with(context).load("https://loremflickr.com/320/240?random=2")
            .into(holder.imgPantiImage)
        holder.tvPantiName.text = "HALOOOO"
        holder.tvPantiChildren.text =
            holder.itemView.context.getString(R.string.total_children_card, children.toString())
        holder.tvPantiLocation.text = location

        holder.itemView.setOnClickListener {
            Toast.makeText(context, "Panti yang lokasinya: $location", Toast.LENGTH_SHORT).show()
        }
    }
}