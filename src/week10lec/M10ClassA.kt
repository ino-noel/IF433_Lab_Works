package week10lec

class meja(val hasil : Any)

class kursi <T>(val hasil : T)

class Televisi<T,V>(val merk:T , val kodeBarcode: V)

fun <T> Alamat (kodepos : T): T {
    return kodepos;
}

class kalkulator<T:Number>(val a : T, val b : T){
    fun tambah (): Int {
        return a.toInt()+b.toInt() ;
    }
    fun kurang () : Double {
        return a.toDouble()-b.toDouble();
    }
}

val arNilai = listOf(10,20,30,40,50,60,70,80,90);
fun <T> nilaiDiatasKKM(list : List<T>, kkm:T): List<T> where T: Comparable <T>{
    return list.filter {it >= kkm};
}

fun main (){
    println("=====generic where=====")
    println("Semua nilai : " + arNilai);
    var nilaikkm = nilaiDiatasKKM(list = arNilai , kkm = 70 )
    println("Nilai diatas kkm :" + nilaikkm);

    println("=====generic kalkulator =====")
    val kal = kalkulator(a = 10.5 , b = 20.43 )
    println("Hasil Penambahan ${kal.a} ditambah ${kal.b}: " + kal.tambah());
    println("Hasil Pengurangan ${kal.a} dikurang ${kal.b}: " + kal.kurang());


    println("=====Implementasi non generic=====")
    val mj = meja(hasil = 100)
    val hargaMeja = mj.hasil as Int
    println(hargaMeja + 50 )

    println("=====Implementasi generic=====")
    val chair =kursi (hasil = 300);
    println(chair.hasil + 50);

    println("=====Generic multi param=====")
    val tv = Televisi(merk = "Samsung", kodeBarcode = 123456)
    println("Merknya" + tv.merk)
    println("Barcode ${tv.kodeBarcode + 777}")

    println("=====Generic function=====")
    println("Kode pos kamu: " + Alamat(kodepos = 12345))
}