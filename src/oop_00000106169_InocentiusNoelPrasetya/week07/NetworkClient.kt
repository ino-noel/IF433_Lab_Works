package oop_00000106169_InocentiusNoelPrasetya.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}