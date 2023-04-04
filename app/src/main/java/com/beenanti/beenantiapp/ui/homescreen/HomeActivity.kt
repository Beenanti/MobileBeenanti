package com.beenanti.beenantiapp.ui.homescreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beenanti.beenantiapp.R
import com.beenanti.beenantiapp.databinding.ActivityHomeBinding
import com.beenanti.beenantiapp.ui.fragments.PantiChildrenTotalFragment
import com.beenanti.beenantiapp.ui.fragments.PantiNearbyListFragment
import com.beenanti.beenantiapp.ui.fragments.PantiUpdateListFragment

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager = supportFragmentManager

        val pantiNearbyListFragment = PantiNearbyListFragment()
        val fragmentPantiNearby =
            fragmentManager.findFragmentByTag(PantiNearbyListFragment::class.java.simpleName)

        val pantiUpdateListFragment = PantiUpdateListFragment()
        val fragmentPantiUpdate =
            fragmentManager.findFragmentByTag(PantiUpdateListFragment::class.java.simpleName)

        val pantiChildrenTotalListFragment = PantiChildrenTotalFragment()
        val fragmentPantiChildrenTotal =
            fragmentManager.findFragmentByTag(PantiChildrenTotalFragment::class.java.simpleName)

        if (fragmentPantiNearby !is PantiNearbyListFragment) {
            fragmentManager.beginTransaction().apply {
                add(
                    R.id.panti_nearby,
                    pantiNearbyListFragment,
                    PantiNearbyListFragment::class.java.simpleName
                )
            }.commit()
        }

        if (fragmentPantiUpdate !is PantiUpdateListFragment) {
            fragmentManager.beginTransaction().apply {

                add(
                    R.id.panti_update,
                    pantiUpdateListFragment,
                    PantiUpdateListFragment::class.java.simpleName
                )
            }.commit()
        }

        if (fragmentPantiChildrenTotal !is PantiChildrenTotalFragment) {
            fragmentManager.beginTransaction().apply {

                add(
                    R.id.panti_children_total,
                    pantiChildrenTotalListFragment,
                    pantiChildrenTotalListFragment::class.java.simpleName
                )
            }.commit()
        }
    }
}