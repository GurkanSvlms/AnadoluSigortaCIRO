package com.example.anadolusigortaciro.ui.home.petsagram.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class PetsagramViewPagerAdapter(
    fragmentList : ArrayList<Fragment>,
    fm : FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm,lifecycle){

    private val list = fragmentList
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }
}