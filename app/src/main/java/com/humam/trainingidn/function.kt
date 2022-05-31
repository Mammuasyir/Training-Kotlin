package com.humam.trainingidn

fun main() {
    cetakNama("Humam", "Muasyir")
    cetakNama("Ruger")
    cetakNama("rudha", "rodhi")
}

fun cetakNama(firstname: String, lastname: String = "") {    //lastname punya nilai default dengan tanda ""
    println("Halo nama saya $firstname $lastname")
}


//named parameter
//dengan memanggil nama argumennya didalam function main, agar memudahkan kita ketika memiliki banyak parameter di dalam function cetak nama
//dan tidak harus berurutan, tpi harus dipanggil semua nama argumennya.
