package com.fittrack.app.data

import com.fittrack.app.model.Yemek

class VeritabaniYoneticisi {
    private val yemekListesi = mutableListOf<Yemek>()

    fun yemekEkle(yemek: Yemek) {
        yemekListesi.add(yemek)
    }

    fun tumYemekleriGetir(): List<Yemek> {
        return yemekListesi
    }

    fun toplamKaloriHesapla(): Int {
        var toplam = 0
        for (yemek in yemekListesi) {
            toplam += yemek.kalori
        }
        return toplam
    }
}
