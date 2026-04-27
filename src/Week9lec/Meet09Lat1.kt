package Week9lec

fun main (){
    println("=========== LIST OF IMUT ===========");
    val arSiswa = listOf("Ali","Budi","cica");
    //view isi arra list
    println(arSiswa);
    //munculin satu item aja
    println("Nama Siswa :" + arSiswa[1]);
    //menghitung banyak item
    println("Banyak siswa: " + arSiswa.size);
    //munculin semua siswa
    for(i in arSiswa){
        println("Ini siswa nya :" + i)
    }

    println("=========== LIST OF MUTABLE ===========");
    val arMatkul = mutableListOf("OOP","Matdis","GameDev");
    arMatkul.add("Kalkulus");
    arMatkul[2] = "pemweb";
    arMatkul.remove("Matdis");
    println(arMatkul);

    println("=========== LIST OF MUTABLE ===========");
    var arNilai = setOf(80,90,20,30,40,50);
    println("Banyak data : ${arNilai.size}");
    println("Angka 20 ada ga? ${arNilai.contains(20)}");
    println(arNilai);
}