package com.sabran.mapskotlin.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.sabran.mapskotlin.DetailWisataMapsActivity
import com.sabran.mapskotlin.Model.ModelWisata
import com.sabran.mapskotlin.R

class AdapterWisata(
    val listItemWisata: List<ModelWisata>
) : RecyclerView.Adapter<AdapterWisata.MyViewHolder>() {
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        val imgWisata: ImageView = itemView.findViewById(R.id.imgWisata)
        val tvNamaTempatWisata: TextView = itemView.findViewById(R.id.tvNamaTempatWisata)
        val tvAlamat: TextView = itemView.findViewById(R.id.tvAlamat)
        val cardWisata: CardView = itemView.findViewById(R.id.cardWisata)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterWisata.MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_wisata,parent, false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: AdapterWisata.MyViewHolder, position: Int) {
        val currentItem = listItemWisata[position]
        holder.imgWisata.setImageResource(currentItem.gambarWisata)
        holder.tvNamaTempatWisata.text = currentItem.namaLokasiWisata
        holder.tvAlamat.text = currentItem.alamatWisata
        //event click pada card view
        holder.cardWisata.setOnClickListener {
            val intentDetailWisata = Intent(holder.itemView.context, DetailWisataMapsActivity::class.java)
            //kirim data list item wisata ke DetailWisataMapsActivity
            intentDetailWisata.putExtra("namaLokasiWisata", currentItem.namaLokasiWisata)
            intentDetailWisata.putExtra("gambarWisata", currentItem.gambarWisata)
            intentDetailWisata.putExtra("deskripsiWisata", currentItem.deskripsiWisata)
            intentDetailWisata.putExtra("latWisata", currentItem.latWisata)
            intentDetailWisata.putExtra("longWisata", currentItem.longWisata)
            //menjalankan intent startActivity
            holder.itemView.context.startActivity(intentDetailWisata)

        }
    }

    override fun getItemCount(): Int {
        return listItemWisata.size
    }
}