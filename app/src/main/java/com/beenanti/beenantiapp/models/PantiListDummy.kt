package com.beenanti.beenantiapp.models

import com.beenanti.beenantiapp.R
import kotlin.random.Random
import kotlin.random.nextInt

object PantiListDummy {
    fun generatePantiListDummy(): ArrayList<PantiRowsItem> {
        val pantiList = ArrayList<PantiRowsItem>()
        for (i in 0..5) {
            val panti = PantiRowsItem(
                jumlahAnak =  i + 11 + Random.nextInt(24..50) + 14,
                namaPimpinan = "Akmal Rafi",
                geom = null,
                alamat = "Alamat panti asuhan update yang ke-$i",
                idPanti = "panti0$i",
                jumlahPengurus = 24,
                statusId = "1",
                idJenis = "1",
                namaPanti = "Panti Asuhan Miracle $i",
                nohp = "081234567$i",
                sosmed = "@pantiasuhanmiracle$i",
                email = "pantiasuhan@miracle$i.co.id",
                createdAt = "2023-03-26T07:05:45.000Z",
                updatedAt = "2023-03-26T07:05:45.000Z"
            )
            pantiList.add(panti)
        }
        return pantiList
    }

    fun generatePantiListDummyNearby(): ArrayList<PantiRowsItem> {
        val pantiList = ArrayList<PantiRowsItem>()
        for (i in 0..5) {
            val panti = PantiRowsItem(
                jumlahAnak = i + 14 + Random.nextInt(10..50) + 9,
                namaPimpinan = "Akmal Rafi",
                geom = null,
                alamat = "Alamat panti asuhan nearby yang ke-$i",
                idPanti = "panti0$i",
                jumlahPengurus = 24,
                statusId = "1",
                idJenis = "1",
                namaPanti = "Panti Asuhan Miracle $i",
                nohp = "081234567$i",
                sosmed = "@pantiasuhanmiracle$i",
                email = "pantiasuhan@miracle$i.co.id",
                createdAt = "2023-03-26T07:05:45.000Z",
                updatedAt = "2023-03-26T07:05:45.000Z"
            )
            pantiList.add(panti)
        }
        return pantiList
    }

    fun generatePantiListDummyTotalChildren(): ArrayList<PantiRowsItem> {
        val pantiList = ArrayList<PantiRowsItem>()
        for (i in 0..5) {
            val panti = PantiRowsItem(
                jumlahAnak = i + 50 + Random.nextInt(15..50) + 9,
                namaPimpinan = "Akmal Rafi",
                geom = null,
                alamat = "Alamat panti asuhan total anak yang ke-$i",
                idPanti = "panti0$i",
                jumlahPengurus = 24,
                statusId = "1",
                idJenis = "1",
                namaPanti = "Panti Asuhan Total Children $i",
                nohp = "081234567$i",
                sosmed = "@pantiasuhanmiracle$i",
                email = "pantiasuhan@miracle$i.co.id",
                createdAt = "2023-03-26T07:05:45.000Z",
                updatedAt = "2023-03-26T07:05:45.000Z"
            )
            pantiList.add(panti)
        }
        return pantiList
    }
}