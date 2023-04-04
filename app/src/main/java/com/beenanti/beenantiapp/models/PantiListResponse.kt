package com.beenanti.beenantiapp.models

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class PantiListResponse(

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("rows")
	val rows: List<PantiRowsItem?>? = null
) : Parcelable

@Parcelize
data class PantiRowsItem(

	@field:SerializedName("jumlah_anak")
	val jumlahAnak: Int? = null,

	@field:SerializedName("nama_pimpinan")
	val namaPimpinan: String? = null,

	@field:SerializedName("geom")
	val geom: Geom? = null,

	@field:SerializedName("alamat")
	val alamat: String? = null,

	@field:SerializedName("id_panti")
	val idPanti: String? = null,

	@field:SerializedName("jumlah_pengurus")
	val jumlahPengurus: Int? = null,

	@field:SerializedName("createdAt")
	val createdAt: String? = null,

	@field:SerializedName("status_id")
	val statusId: String? = null,

	@field:SerializedName("id_jenis")
	val idJenis: String? = null,

	@field:SerializedName("nama_panti")
	val namaPanti: String? = null,

	@field:SerializedName("nohp")
	val nohp: String? = null,

	@field:SerializedName("sosmed")
	val sosmed: String? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
) : Parcelable

@Parcelize
data class Geom(
	@field:SerializedName("coordinates")
	val coordinates: List<Double?>? = null,

	@field:SerializedName("type")
	val type: String? = null
) : Parcelable
