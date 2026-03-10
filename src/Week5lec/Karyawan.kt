package Week5lec

abstract class Karyawan {
    val nama:String = "Budi";
    abstract fun bekerja(kecepatan:Int):String;

    fun terima_gaji(){
        println("hore gajian")
    }
}

class Staff : Karyawan() {
    override fun bekerja(kecepatan: Int ): String {
        return " Staff ngetik, kecepatan $kecepatan";
    }
    fun pegang_uang ():String {
        return "staff pegang uang";
    }
}

class Manager:Karyawan(){
    override fun bekerja (kecepatan: Int): String{
        return "manager mengawasi $kecepatan km/jam";
    }
    fun quality_control ():String {
        return "manager melakukan Quality control";
    }
}

fun main (){
    var  listKry : List <Karyawan> = listOf(
        Staff(),
        Manager(),
    );

    println("Jenis karyawan ada " + listKry.size);

    for (kry in listKry){
        //manggil kedua class fun dengan nama method sama
        println("kerjanya karyawan : " + kry.bekerja(kecepatan = 3));

        //manggil fun dengan nama method beda
        if (kry is Staff){
            println(kry.pegang_uang());
        } else if (kry is Manager){
            println(kry.quality_control());
        }

        // manggil fun dengan nama method beda - cara2
        when(kry){
            is Staff ->{
                println("when staff: " + kry.pegang_uang());
            }
            is Manager ->{
                println("when manager: " + kry.quality_control());
            }
        }
    }


    /*val staf = Staff();
    println("staf bekerja: ${staf.bekerja(kecepatan = 7)}");

    val mgr = Manager();
    println("Manager kerja : " + mgr.bekerja (kecepatan = 12));
    mgr.bekerja (30 );

     */
}