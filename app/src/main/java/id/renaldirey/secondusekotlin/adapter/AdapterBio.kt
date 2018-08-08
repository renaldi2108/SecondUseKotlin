package id.renaldirey.secondusekotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.renaldirey.secondusekotlin.model.Models
import id.renaldirey.secondusekotlin.R.layout.list_item
import kotlinx.android.synthetic.main.list_item.view.*

class AdapterBio (private  val ctx : Context, private val modelItems : List<Models>) : RecyclerView.Adapter<AdapterBio.ViewHolder>() {

    init {
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder (LayoutInflater.from(ctx).inflate(list_item,parent,false))

    override fun getItemCount(): Int  = modelItems.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(modelItems[position])
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bindItems(item: Models) {
            itemView.tv_id.text = item.id
            itemView.tv_nama.text = item.nama
        }
    }

}