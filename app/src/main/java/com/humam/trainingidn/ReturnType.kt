package com.humam.trainingidn

fun main() {
    val luas = luasSegitiga(12, 100)
    println(luas)

    luasPersegi(15,20)
}

fun luasSegitiga(alas: Int, tinggi: Int): Int {
    return (0.5 * alas * tinggi).toInt()
}

//Single Expression Function

fun luasPersegi(sisi1: Int, sisi2: Int): Int = sisi1 * sisi2