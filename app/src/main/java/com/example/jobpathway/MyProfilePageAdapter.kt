package com.example.jobpathway

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyProfilePageAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 3 // Number of tabs/fragments

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentPersonal()
            1 -> FragmentProfessional()
            2 -> FragmentSkill()
            else -> Fragment()  // Handle unexpected positions
        }
    }
}