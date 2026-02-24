package Week03

class Pelajar {
    private var nama: String = "blom ada nama"
    private var nilai: Int = 0

    fun set_nama(namaorang: String) {
        if (namaorang.isBlank()) {
            println("eh nama orang gabole kosong")
        } else {
            this.nama = namaorang
        }
    }

    fun set_nilai(nilaiNew: Int) {
        if(nilaiNew in 0..100){
            this.nilai = nilaiNew
        } else {
            println("ga ada nilai")
        }
    }

    fun get_nama(): String {
        return this.nama
    }

    fun get_nilai(): Int {
        return this.nilai
    }
}



fun main() {
    val mahasiswa = Pelajar()

    mahasiswa.set_nama("Budi")   // ✅ function invocation
    mahasiswa.set_nilai(10)
    println("Nama Kamu : ${mahasiswa.get_nama()}")
    println("Nilai Kamu : ${mahasiswa.get_nilai()}")
}
