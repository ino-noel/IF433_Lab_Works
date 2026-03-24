package Week6lec

class Karyawan(override val namaKerjaan: String, override val gaji : Int, override val jmlHari: Int, override val namaGame: String, override val waktuMain : Int): Bekerja, Bermain {
    override fun ngoding() {
        println("kerjaan kamu $namaKerjaan");
        println("gaji kamu ${super.GajiDidapat}");
    }
    override fun main_game (){
        println("main $namaGame selama $waktuMain")
    }

    override fun tester() {
        super<Bekerja>.tester();
        super<Bermain>.tester();
    }
}