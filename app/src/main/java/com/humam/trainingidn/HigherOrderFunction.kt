package com.humam.trainingidn

fun main() {
    val upperCase = {name: String -> name.uppercase()}
    val lowerCase = {name: String -> name.lowercase()}

    val status = {nilai: Int ->
        if (nilai % 2 == 0){
            "genap"
        } else{
            "ganjil"
        }
    }

    println(hello("HUmAm", upperCase))
    println(hello("HUmAm", lowerCase))

    println(cekNilai(42, status))

    //trailing lambda
    val result = hello("HumaM"){name: String ->
        name.uppercase()
    }
    println(result)
}

fun hello(value: String, convert: (String) -> String): String{
    return "Hallo nama saya ${convert(value)}"
}

//Jadi kita bisa mengcustom fungsi dari lambda ini tidak terbatas hanya pada satu kondisi saja, bisa menambahkan banyak kondisi
// dan mempersingkat agar tidak membuat banyak fungsi lambda dari awal lagi, tinggal menambahkan kondisi lanjutannya saja.

fun cekNilai(nilai: Int, status: (Int) -> String): String {
    return "Nilai ini adalah ${status(nilai)}"
}