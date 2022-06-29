package com.humam.binaracademy

fun main() {
//    var num = 131
//    var reversedInteger = 0
//    var remainder: Int
//    val originalInteger: Int
//
//    originalInteger = num
//
//    while (num != 0) {
//        remainder = num % 10
//        reversedInteger = reversedInteger * 10 + remainder
//        num /= 10
//    }
//
//    if (originalInteger == reversedInteger)
//        println("$originalInteger is a palindrome.")
//    else
//        println("$originalInteger is not a palindrome.")

    var kata = "aku"

    var reversedString = ""
    var originalString: String

    originalString = kata

//substring berfungsi untuk mengambil beberapa karakter dari sebuah kata/kalimat
    while (kata.length != 0) {
        reversedString += kata.substring(kata.length - 1)
        kata = kata.substring(0, kata.length - 1)
    }

    if (originalString == reversedString)
        println("$originalString is a palindrome.")
    else
        println("$originalString is not a palindrome.")

    var namaLengkap = "Mas Junaidi"
    var namaBelakang = namaLengkap.substring(4,11)

    print(namaBelakang)

}