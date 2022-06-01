package com.humam.trainingidn

fun main() {
        val CaseAnon = fun(name:String, umur: Int): String{
        return when{
            umur > 20 -> "Halo nama saya $name dan saya Sudah dewasa"
            umur > 17 -> "Halo nama saya $name dan saya Masih remaja"
            else -> "Halo nama saya $name dan saya Masih Anak2"
        }
    }

    println(lambdaexample("Humam", 16, CaseAnon))
    println(lambdaexample("Humam", 21, fun(name:String, umur: Int): String{
        return when{
            umur > 20 -> "Halo nama saya $name dan saya Sudah dewasa"
            umur > 17 -> "Halo nama saya $name dan saya Masih remaja"
            else -> "Halo nama saya $name dan saya Masih Anak2"
        }
    }))
}

fun lambdaexample(name: String, umur: Int, cetak: (String, Int) -> String): String {
    return cetak(name, umur)
}