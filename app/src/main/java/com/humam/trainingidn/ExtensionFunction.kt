package com.humam.trainingidn

fun main() {
    val name = "humam"
    val result = name.hello()
    println(result)

    val sisi1 = 50
    val sisi2 = 50
    val luas = sisi1 * sisi2
    luas.cetakLuas()

}

fun String.hello(): String = "Hello $this"

fun Int.cetakLuas() {
     println("Luasnya adalah $this cm")    //tanpa pakai return
}

