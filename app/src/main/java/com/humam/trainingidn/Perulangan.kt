package com.humam.trainingidn

fun main() {
//    val myCats = arrayOf("joko", "pororo", "kidung", "item")
//    for (name in myCats)
//        println(name)

    //for range , mencetak sampe angka terakhir
    for (name in 1..3) {
        println(name)
    }

    //fungsi until tidak mencetak angka terakhir yang ada
//    for (angka in 0 until 20)
//        println(angka)

    //While Loops itu mengecek terlebih dahulu baru eksekusi
    var count = 0

//    while (count <= 10){
//        println("nilai $count")
//        count++
//    }

    //Do While eksekusi dulu baru dia ngecek
    do {
        println("nilai $count")
        count++
    }
    while (count <= 10)
}