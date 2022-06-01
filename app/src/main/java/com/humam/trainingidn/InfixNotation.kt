package com.humam.trainingidn

fun main() {
    val result = "Humam" convert "up"
    println(result)
}

infix fun String.convert(type: String): String{
    if (type =="up"){
        return this.uppercase()
    } else{
        return this.lowercase()
    }
}

//return

//Function Scope itu fungsi di dalam fungsi, agar tidak bisa diakses di kelas/file lain
