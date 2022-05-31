package com.humam.trainingidn

fun main() {
    val example = """
        halo nama saya agung
        saya anak bapak sugeng
        dan ibu saya ruweh
    """.trimIndent()
    println(example)

    val examples = """
        #halo nama saya agung
        #saya anak bapak sugeng
        #dan ibu saya ruweh
    """.trimMargin("#")
    println(examples)

    val firstname = "Humam"
    val lastname = "Muasyir"
    val fullname = firstname + " " + lastname
    println(fullname)

    //string template
    val address  = "hallo nama saya $fullname rumah saya di bogor"
    val example3 = "5 + 5 = ${5 + 5}"
    val exampleBoolean = "variable firstname dan lastname = ${firstname == lastname}"
    println(address)
    println(example3)
    println(exampleBoolean)

    println(APP)

}

//fungsi trimIndent menghapus sisi kiri dari teks

//fungsi trimMargin menghapus tanda yang ada didalam teks yg dibutuhkan