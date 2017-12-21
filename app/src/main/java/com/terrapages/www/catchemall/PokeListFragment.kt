package com.terrapages.www.catchemall

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by dyuan on 12/19/2017.
 */
/*
class PokeListFragment(passedContext: Context) : Fragment() {

    val pokeFactory : PokeFactory = PokeFactory(passedContext)
    val ARG_LIST_TYPE = "LIST_TYPE"
    val passThroughContext : Context = passedContext

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView = inflater!!.inflate(R.layout.poke_fragment, container, false)
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.pokeRecyclerView) as RecyclerView
        val listType = this.arguments.getSerializable(ARG_LIST_TYPE) as PokeListType
        var pokes = ArrayList<Poke>()
        when (listType) {
            PokeListType.All -> pokes = pokeFactory.pokes
        }

        recyclerView.adapter = PokeAdapter(pokes)
        recyclerView.layoutManager = LinearLayoutManager(passThroughContext)
        return rootView
    }

    companion object {
        val ARG_LIST_TYPE = "LIST_TYPE"

        fun newInstance(listType: PokeListType, context: Context): PokeListFragment {
            val fragment = PokeListFragment(context)
            val args = Bundle()
            args.putSerializable(ARG_LIST_TYPE, listType)
            fragment.arguments = args
            return fragment
        }
    }
}
*/