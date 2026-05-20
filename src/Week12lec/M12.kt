package Week12lec

fun basic_trycatch(pembilang:Int, penyebut:Int){
    try{
        val hasil = pembilang / penyebut;
        println("hasil bagi $hasil");
    } catch (e: Exception){
        println("Ada error pembagian ${e.message}");
    } finally {
        println("Selesai pembagian");
    }
}

fun cek_tipe_data(angka:String){
    var nilai : Int = try{
        Integer.parseInt(angka);
    } catch (e: Exception){
        println("ada error di cek tipe data ${e.message}")
        123
    }
    println("nilai kamu $nilai");
}

fun cek_gaji (hariKerja:Int){
    if(hariKerja <0 ){
        throw IllegalArgumentException("Masa hari kerja minus");
    } else {
        val gaji = hariKerja * 1000 ;
        println("Gaji kamu $gaji");
    }
}

class cekSaldoBank(val saldoKamu:Int, val jajanKamu:Int):
    Exception("Saldo kamu $saldoKamu jajan kamu $jajanKamu , gak cukup lahh");

class transaksi_pembelian(val saldoAwal : Int){
    fun mulai_jajan(pengeluaranKamu : Int ){
        if(saldoAwal < pengeluaranKamu){
            throw cekSaldoBank(saldoAwal,pengeluaranKamu);
        } else {
            val sisaSaldo = saldoAwal - pengeluaranKamu;
            println("Sisa Saldo kamu $sisaSaldo");
        }
    }
}

fun multi_catch(input:String, penyebut:Int){
    try {
        val num:Int = input.toInt();
        println("hasil pembagian adalah ${num/penyebut}")
    }catch (e: NumberFormatException){
        println("ada error multicatch,salah format: ${e.message}");
    } catch (e: ArithmeticException){
        println("ada error multicatch,arithmetic: ${e.message}")
    } catch (e: Exception){
        println("ada error multicatch,Errornya adalah: ${e.message}")
    }
}

fun main (){
    multi_catch("adadaadadasd", 2)

    val trxBeli = transaksi_pembelian(1000);
    try {
        trxBeli.mulai_jajan(1300);
    }catch (e : Exception){
        println("ada error di custom exception ::::: ${e.message}");
    }

    try {
        cek_gaji(-1)
    } catch (e: Exception){
        println("error coba catch ::: ${e.message}");
    }

    cek_tipe_data("abc");

    basic_trycatch(10, 0);
}