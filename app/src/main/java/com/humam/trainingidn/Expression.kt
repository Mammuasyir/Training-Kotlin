package com.humam.trainingidn

fun main() {

    val number = 'f'

    when(number){
        'a', 'c' -> println("bagus")  //Multiple Choice
        'b' -> println("mayan")
        else -> println("coba lagi")
    }

    val nilai = arrayOf(80,90,100) //80..100
    val person1 = 80

    when(person1){
        in nilai -> println("kamu lulus")
        !in nilai -> println("gagal")
    }

    when(person1){
        is Int -> println("ini adalah integer")
        !is Int -> println("ini bukan integer")
    }

    //when sebagai pengganti if Else
    val nilai1 = 80

    when{
        nilai1 % 2 == 0 -> println("Ini adalah bilangan genap")
        nilai1 % 2 != 0 -> println("Ini adalah bilangan ganjil")
    }
}
