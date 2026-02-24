package oop_00000106169_InocentiusNoelPrasetya.week03

fun main() {
    val e = Employee("Budi")

    // Test validasi
    e.salary = -1000 // Harusnya error
    e.salary = 5000000
    println("Gaji: ${e.salary}")
}