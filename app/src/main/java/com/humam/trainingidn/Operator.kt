package com.humam.trainingidn

fun main() {
    var jumlah = 20 + 30
    val kurang = 30 - 10
    val kali = 10 * 8
    val bagi = 30 / 3
    val modulus = 40 % 3 //biasanya digunakan untuk menentukan bilangan ganjil genap
    val modulus2 = 40 % 3 == 0 //boolean

    //untuk prioritas kasih tanda kurung pada penjumlahan drpd perkalian
    println(modulus)
    println(modulus2)

    //Augmented Assigment

    jumlah += 10  //menambah nilai dari variable awal
    println(jumlah)

    jumlah++
    println(jumlah)
}