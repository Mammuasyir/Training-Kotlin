package com.humam.trainingidn

fun main() {

    //HIGHER ORDER FUNCTION
//    val cetak = {name:String, umur:Int ->
//        when{
//            umur > 20 -> "Halo nama saya $name dan saya Sudah dewasa"
//            umur > 17 -> "Halo nama saya $name dan saya Masih remaja"
//            else -> "Halo nama saya $name dan saya Masih Anak2"
//        }
//    }
//
//    println(lambda("Humam", 16, cetak))

    //Trailing lambda
    val result = lambda("Humam", 21) { name: String, umur: Int ->
        when {
            umur > 20 -> "Halo nama saya $name dan saya Sudah dewasa"
            umur > 17 -> "Halo nama saya $name dan saya Masih remaja"
            else -> "Halo nama saya $name dan saya Masih Anak2"
        }
    }
    println(result)
}

fun lambda(name: String, umur: Int, cetak: (String, Int) -> String): String {
    return cetak(name, umur)
}