package com.beenanti.beenantiapp.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Panti(
    val pantiId: String,
    val pantiName: String,
    val pantiPhoto: String, // TODO: Ubah jadi List String
    val pantiAddress: String,
    val lat: Double?,
    val lon: Double?,
    val pantiChildrenTotal: Double,
    val pantiCaretakerTotal: Double,
) : Parcelable
