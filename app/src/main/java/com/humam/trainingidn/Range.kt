package com.humam.trainingidn

fun main() {
    val numberRange = 1..40 step 2
    println(numberRange)
    println(numberRange.count()) // menghitung jumlah angka di dalamnya
    println(numberRange.contains(120)) //boolean

    println(numberRange.first)
    println(numberRange.last)
    println(numberRange.step) // kenaikan angka

    val numberRangeDown = 40 downTo 1
    numberRangeDown.forEach {
        println(it)
    }
}