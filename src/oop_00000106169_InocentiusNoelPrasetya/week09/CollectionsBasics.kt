package oop_00000106169_InocentiusNoelPrasetya.week09

fun main() {
    println("=== TEST LIST ===")
    // Immutable: tidak bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    // frameworks.add("Python") // UNCOMMENT INI AKAN ERROR!
    println("Immutable List: $frameworks")

    // Mutable: bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}