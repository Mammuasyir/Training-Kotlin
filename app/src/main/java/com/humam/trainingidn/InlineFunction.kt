package com.humam.trainingidn

fun main() {
    println(hello2{("Humam".uppercase())})
}

inline fun hello2(convert: () -> String): String{
    return convert()
}
