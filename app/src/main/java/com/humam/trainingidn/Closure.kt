package com.humam.trainingidn

fun main() {
    var counter = 0

    val increment: () ->Unit = {
//        println(counter)
        counter++
    }

    val increment2 = fun() {
//        println(counter)
        counter++
    }

    increment()
    increment2()
    println(counter)
}