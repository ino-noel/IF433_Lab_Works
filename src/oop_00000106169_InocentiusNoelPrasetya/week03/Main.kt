package oop_00000106169_InocentiusNoelPrasetya.week03

fun main() {
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")

    println("\\n=== TEST WEAPON ===")
    val sword = Weapon("Excalibur")

    sword.damage = -50
    println("Damage setelah set -50: ${sword.damage}")

    sword.damage = 9999
    println("Damage setelah set 9999: ${sword.damage}")

    println("Tier: ${sword.tier}")
}