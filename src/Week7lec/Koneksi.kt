package Week7lec

object Koneksi {

    var alamatServer: String = "http://localhost:8080";

    fun konek_db(){
        println("konek ke DB saya di $alamatServer");
    }
}