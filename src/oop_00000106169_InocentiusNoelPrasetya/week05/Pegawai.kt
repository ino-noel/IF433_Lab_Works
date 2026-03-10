package oop_00000106169_InocentiusNoelPrasetya.week05

abstract class Pegawai(val nama: String) {
    // Abstract function tidak memiliki body (tanpa kurung kurawal)
    // WAJIB di-override oleh semua class anak
    abstract fun bekerja()
}