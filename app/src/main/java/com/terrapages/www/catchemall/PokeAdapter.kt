package com.terrapages.www.catchemall

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout

/**
 * Created by dyuan on 12/19/2017.
 */
class PokeAdapter(private val pokes: ArrayList<Poke>) : RecyclerView.Adapter<PokeHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PokeHolder {
        val pokeItem = LayoutInflater.from(parent.context).inflate(R.layout.poke_item, parent, false) as LinearLayout
        return PokeHolder(pokeItem)
    }

    override fun onBindViewHolder(holder: PokeHolder?, position: Int) {
        holder.updateWithPoke(pokes[position])
    }

    override fun getItemCount(): Int {
        return pokes.toArray().count()
    }
}
