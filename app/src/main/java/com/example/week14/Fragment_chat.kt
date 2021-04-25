package com.example.week14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.week14.adapter.TabNav
import com.google.android.material.tabs.TabLayout


class Fragment_chat : Fragment() {
    private lateinit var viewpage : ViewPager
    private lateinit var tabs : TabLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_chat,container,false)
        viewpage = view.findViewById(R.id.Pagar)
        tabs = view.findViewById(R.id.Tablayout)
        val fragmentadapter = TabNav(childFragmentManager)
        viewpage.adapter = fragmentadapter
        tabs.setupWithViewPager(viewpage)
        return view


    }

}