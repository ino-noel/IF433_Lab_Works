package oop_00000106169_InocentiusNoelPrasetya.week03

fun main() {
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000 // Ini akan crash!
}