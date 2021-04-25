package com.example.week14.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.week14.Fragment_live
import com.example.week14.Fragment_panggilan
import com.example.week14.Fragment_status

class TabNav(supp : FragmentManager) : FragmentPagerAdapter(supp,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> Fragment_live()
            1 -> Fragment_status()
            else -> Fragment_panggilan()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "Chat"
            1 -> "Status"
            else -> "Panggilan"
        }
    }
}