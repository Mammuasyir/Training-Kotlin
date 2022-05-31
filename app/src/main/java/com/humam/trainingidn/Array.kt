package com.humam.trainingidn

fun main() {

    val members: Array<String?> = arrayOf("rodhi", "sofi", "zaidun", null, null)
    println(members.size)
    println(members.get(1))
    println(members[2])

    members.set(2, "rival")
    println(members[2])

    members[1] = "Yudi"
    println(members[1])

    members.forEach {
        print("nama saya $it, ")
    }

    val array2: Array<String?> = arrayOfNulls(5)
    array2.set(2, "rodhi")

}