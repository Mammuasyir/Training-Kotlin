package com.humam.binaracademy

fun main() {
    val stringNumber = "12345"

    val convertStringtoInt = stringNumber.toInt()
    println(convertStringtoInt)

//    print("Masukkan bilangan pertama: ")
//    val numberOne = readLine()
//    print("Masukkan bilangan kedua: ")
//    val numberTwo = readLine()
//    println("Bilangan Pertama: $numberOne dan Bilangan kedua: $numberTwo")

    callMe()
    println(calculate())

}

fun callMe() : Double {
    return calculate()
}

fun calculate() : Double {
    return (5+5).toDouble()
}