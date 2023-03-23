package com.beenanti.beenantiapp.ui.pantidetailscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.beenanti.beenantiapp.R
import com.beenanti.beenantiapp.databinding.ActivityPantiDetailBinding
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class PantiDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPantiDetailBinding

    private val images = ArrayList<SlideModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantiDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        appbarFunction()

        images.apply {
            add(
                SlideModel(
                    R.drawable.deletesoon_pexels_agung_pandit_wiguna_3401403,
                    ScaleTypes.CENTER_CROP
                )
            )
            add(
                SlideModel(
                    R.drawable.deletesoon_pexels_julia_m_cameron_4145069,
                    ScaleTypes.CENTER_CROP
                )
            )
            add(
                SlideModel(
                    R.drawable.deletesoon_pexels_olia_danilevich_5088021,
                    ScaleTypes.CENTER_CROP
                )
            )
        }

        val carouselView = binding.pantiImgSlider
        carouselView.setImageList(images)
    }

    private fun appbarFunction() {
        binding.detailPantiAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_more_vertical -> {
                    Toast.makeText(this, "Menu more button :D", Toast.LENGTH_SHORT)
                        .show()
                    true
                }
                else -> true
            }
        }
    }
}