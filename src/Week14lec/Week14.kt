package Week14lec

class khs_mahasiswa {
    fun hitung_tugas(quiz: Double, tugasHarian: Double): Double {
        return (quiz * 0.3) + (tugasHarian * 0.7)
    }

    fun hitung_na(tugas: Double, uts: Double, uas: Double): Double {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4)
    }
}
class khs_db {
    fun simpan_nilai(nim:String,nama: String,na: Double):String{
        return "nilai $nim $nama dengan nilai $na berhasil simpan"
    }
    fun load_nilai (nim:String):String{
        return "load nilai si $nim berhasil";
    }
}

fun main(){
    val khsMhs = khs_mahasiswa();
    val tugasMhs = khsMhs.hitung_tugas( 83.5,  90.78);
    val naMhs = khsMhs.hitung_na(tugasMhs, 70.56,  68.77);

    val khsDb = khs_db();
    val statSimpan = khsDb.simpan_nilai("123", "Luffy",naMhs);
    println(statSimpan);
}