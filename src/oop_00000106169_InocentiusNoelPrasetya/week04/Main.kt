package oop_00000106169_InocentiusNoelPrasetya.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    // === TAMBAHKAN KODE ELECTRICCAR DI BAWAH INI ===
    println("\\n--- Testing ElectricCar ---")
    val myTesla = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myTesla.accelerate()  // Method yang sudah final
    myTesla.honk()        // Mewarisi dari Car
    myTesla.openTrunk()   // Mewarisi dari Car
}