package oop_00000106169_InocentiusNoelPrasetya.week04

class ElectricCar(
    brand: String,
    numberOfDoors: Int,
    val batteryCapacity: Int
) : Car(brand, numberOfDoors) {

    // Keyword 'final' membuat method ini tidak bisa di-override lagi oleh class turunan
    final override fun accelerate() {
        // TIDAK memanggil super.accelerate()
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}