package com.terrapages.www.catchemall

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by dyuan on 12/20/2017.
 */
class TabPagerAdapter(fm: FragmentManager, private var tabCount: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        when (position) {
            0 -> return MapFragment()
            1 -> return ListFragment()
            else -> return null
        }
    }

    override fun getCount(): Int {
        return tabCount
    }
}