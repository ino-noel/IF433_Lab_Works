package Week7lec

fun main (){
    println("server : " + Koneksi.alamatServer);
    Koneksi.konek_db();

    println("Kampus:" + Hitungan.namaKampus);
    println("Nomor:" + Hitungan.noIndukKampus);
    println("tambahan:" + Hitungan.penambahan(a=10, b=20));
}
