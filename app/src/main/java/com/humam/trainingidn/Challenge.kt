package com.humam.trainingidn

fun main() {

//    val data = cetak(name = "Ganjar", umur = 15 )    //named argument
//    println(data)

    val cetak: (String, Int) -> String = ::MethodReferences

    //Pake fungsi lambda
    val data = cetak("Humam", 20)
    println(data)
}

//Method References
fun MethodReferences(name:String,umur: Int) : String =
    when{
        umur > 20 -> "Halo nama saya $name dan saya Sudah dewasa"
        umur > 17 -> "Halo nama saya $name dan saya Masih remaja"
        else -> "Halo nama saya $name dan saya Masih Anak2"
    }

//fun cetak(name: String, umur: Int): String {
//    return when{                                                 //pakai return agar tidak berulang dibawahnya
//        umur > 20 -> "Halo nama saya $name dan saya Sudah dewasa"
//        umur > 17 -> "Halo nama saya $name dan saya Masih remaja"
//        else -> "Halo nama saya $name dan saya Masih Anak2"
//    }
//}