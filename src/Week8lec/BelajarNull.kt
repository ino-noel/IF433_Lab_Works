package Week8lec

class set_krs(val nim:String, val tahun:Int?){
    fun pilih_matkul(kodeMatkul: String?) {
        println("matkul dipilih  $kodeMatkul");
    }
}
fun main(){
    var nama : String? = "Wirawan";
    nama = null ;
    println("hai $nama");

    val setKrs = set_krs(nim = "09123", null)
    println("si ${setKrs.nim} masuk tahun ${setKrs.tahun}");
    setKrs.pilih_matkul(null);
}