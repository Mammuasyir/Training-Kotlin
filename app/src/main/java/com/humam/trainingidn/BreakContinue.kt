package com.humam.trainingidn

fun main() {
    var a = 0

    while (true){
        println(a)
        a++
        if (a > 30){    //angka terakhir tidak tercetak
            break
        }
    }

    for (i in 1..100){
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
}