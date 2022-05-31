package com.humam.trainingidn

fun main() {

    cetak(name = "Ganjar", umur = 18 )
}

fun cetak(name: String, umur: Int) {
    when{
        umur > 20 -> println("Halo nama saya $name dan saya Sudah dewasa")
        umur > 17 -> println("Halo nama saya $name dan saya Masih remaja")
        umur < 17 -> println("Halo nama saya $name dan saya Masih Anak2")
    }
}