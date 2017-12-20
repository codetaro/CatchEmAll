package com.terrapages.www.catchemall

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.terrapages.www.catchemall.ListFragment.OnListFragmentInteractionListener
import com.terrapages.www.catchemall.dummy.DummyContent.DummyItem

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class MyPokemonRecyclerViewAdapter(private val mValues: List<DummyItem>, private val mListener: OnListFragmentInteractionListener?) : RecyclerView.Adapter<MyPokemonRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_pokemon, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.pokemonName.text = "#65 Alakazam"
        holder.pokemonCaughtDate.text = "Caught: 18/12/2017"
        holder.pokemonImage.setImageResource(R.drawable.list_alakazam_600x600)

//        holder.mView.setOnClickListener {
//            mListener?.onListFragmentInteraction(holder.mItem)
//        }
    }

    override fun getItemCount(): Int {
        return mValues.size
    }

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {

        var pokemonImage: ImageView
        var pokemonName: TextView
        var pokemonCaughtDate: TextView

        init {
            pokemonImage = mView.findViewById<View>(R.id.pokemon_image) as ImageView
            pokemonName = mView.findViewById<View>(R.id.pokemon_name) as TextView
            pokemonCaughtDate = mView.findViewById<View>(R.id.pokemon_caught_date) as TextView
        }

//        override fun toString(): String {
//            return super.toString() + " '" + mContentView.text + "'"
//        }
    }
}
