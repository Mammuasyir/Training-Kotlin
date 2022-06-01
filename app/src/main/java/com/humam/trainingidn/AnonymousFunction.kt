package com.humam.trainingidn

//Ini hanya salah satu fungsi saja, dan lebih panjang dari pada trailing

fun main() {
    val upperCaseAnon = fun(value: String): String{
        return value.uppercase()
    }

    val result = anon("HumaM", upperCaseAnon)

    //Anonymous Function as Parameter, jadi kita tidak perlu membuat variable lainnya lagi, cukup langsung gabung saja dengan func lambda
    val result2 = anon("HumaM", fun(value: String): String{
        return value.uppercase()
    })
    println(result)
    println(result2)
}

fun anon(name: String, convert: (String)-> String): String{
    return "Hallo nama saya ${convert(name)}"
}