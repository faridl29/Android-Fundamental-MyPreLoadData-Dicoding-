package com.example.mypreloaddata.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mypreloaddata.R
import com.example.mypreloaddata.model.MahasiswaModel
import kotlinx.android.synthetic.main.item_mahasiswa_row.view.*

class MahasiswaAdapter : RecyclerView.Adapter<MahasiswaAdapter.MahasiswaHolder>(){

    private val listMahasiswa = ArrayList<MahasiswaModel>()

    fun setData(listMahasiswa: ArrayList<MahasiswaModel>){
        if(listMahasiswa.size > 0 ){
            this.listMahasiswa.clear()
        }

        this.listMahasiswa.addAll(listMahasiswa)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_mahasiswa_row, parent, false)
        return MahasiswaHolder(view)
    }

    override fun getItemViewType(position: Int): Int = position

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getItemCount(): Int = listMahasiswa.size

    override fun onBindViewHolder(holder: MahasiswaHolder, position: Int) {
        holder.bind(listMahasiswa[position])
    }


    class MahasiswaHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(mahasiswa: MahasiswaModel){
            with(itemView){
                txt_nim.text = mahasiswa.nim
                txt_name.text = mahasiswa.nama
            }
        }
    }
}