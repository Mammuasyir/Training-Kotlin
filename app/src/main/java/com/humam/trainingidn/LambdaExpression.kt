package com.humam.trainingidn

fun main() {
    val convertUppercase: (String) -> String = {name: String ->
         name.uppercase()
    }

    val name = convertUppercase("HuMam")
    println(name)
}