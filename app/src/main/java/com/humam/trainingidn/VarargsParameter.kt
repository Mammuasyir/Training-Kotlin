package com.humam.trainingidn

fun main() {
    finalValue("humam", 12,19,20)
}
// untuk type data yang sama bisa menggunakan vararg agar nilai bisa lebih dari satu
fun finalValue(name: String, vararg values:Int) {
    var total = 0
    for (nilai in values){
        total += nilai
    }
    println("final Value $name = $total")
}