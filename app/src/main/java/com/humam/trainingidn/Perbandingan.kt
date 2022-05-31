package com.humam.trainingidn

fun main() {
    val angka1 = 20
    val angka2 = 91
    val angka3 = 215
    val angka4 = 100
    println(angka1 != angka2)
    println(angka1 > angka2)
    println(angka1 < angka2)
    println(angka1 == angka2)

    //Operasi boolean
    println(angka1 != angka2 && angka3 == angka4)
    println(angka1 != angka2 || angka3 == angka4)

    val perbandingan = angka1 != angka2 || angka3 == angka4
    println(!perbandingan)

    //if Expression
    if (angka3 % 3 != 0  ) {
        println("ini adalah angka genap")
    } else{
        println("ini adalah angka ganjil")
    }

}