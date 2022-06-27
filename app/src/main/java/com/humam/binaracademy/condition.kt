package com.humam.binaracademy

fun main() {

    var input: Any = 60

    if (input in 80..100) {
        if (input in 80..90) {
            print("A")
        } else {
            println("A+")
        }
    } else if (input in 70..79) {
        println("B")
    } else {
        println("C")
    }

    when {
        input is Int -> {
            println("Angka")
        }
        input is String -> {
            println("Kalimat")
        } else -> {
            println("Tidak ditemukan")
        }
    }

    var result = ""

    when(input){
        in 80..100 -> {
            result = "A"
        }
        in 70..79 -> {
            result = "B"
        }
        else -> {
            result = "C"
        }
    }
}