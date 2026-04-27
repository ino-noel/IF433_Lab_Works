package Week8lec

class Alamat(val nomor:String, val kota:String)
class Mahasiswa(val nama :String, val addr : Alamat?)

fun main (){
    val alm = Alamat(nomor = "67", kota = "tangerang");
    // val mhs = Mahasiswa ("Wiraawan, Null")
    val mhs = Mahasiswa (nama = "wirawan", addr = alm);

    //kalo alamatnya null kita akan kasih nilai defaultt
    val defKota = mhs.addr?.let {
        alamatDefault -> "tinggal di ${mhs.addr.nomor}"
    }?:"tidak tahu tinggal dmn";

    println("hai ${mhs.nama} kamu tinggal di ${defKota}");
}