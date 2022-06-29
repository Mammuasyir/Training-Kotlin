package com.humam.binaracademy

fun main() {
    // for, while, do while

    for (index in 0..10 step 2){
        print(index)
    }

    for (indexs in 10 downTo 0 step 2){
        print(indexs)
    }

    val arrayItems = arrayOf("Apple", "Banana", "Orange")
    for (item in arrayItems){
        println(item)
    }

    //tidak tau rentannya sampai berapa
    var repeat = true
//    while (repeat){
//        println("apakah ingin mengulang?")
//        val input = readLine()
//        if (input.equals("tidak") ){
//            repeat = false
//        }
//    }

    do {
        print("apakah ingin mengulang?")
        val input = readLine()
        if (input.equals("tidak") ){
            repeat = false
        }
    }while (repeat)

}