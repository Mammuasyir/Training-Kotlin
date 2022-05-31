package com.humam.trainingidn

//variable Constable
const val APP = "com.humam.idn"


fun main() {
    //Nullable
    var myName: String? = "Joko"
    println(myName?.length)
    myName = null
    println(myName?.length)
}
