package com.humam.binaracademy

fun main() {

    print("Tulis jam kehadiranmu :")
    val presensi : Int = readLine()!!.toInt()

    if (presensi <= 7) {
        println("Kepagian")
    } else if (presensi == 8){
        println("Tepat waktu")
    } else {
        println("Pulang aja :P")
    }
}