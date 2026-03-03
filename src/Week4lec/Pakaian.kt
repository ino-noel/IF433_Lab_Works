package Week4lec

open class Pakaian {
    private var merk: String = "";
    protected var harga : Int = 0;
    init {
        this.merk = "uniqlo";
        println("merk is $merk");
    }

    public fun jumlah_penjualan(){
        println("Pakaian terjual ");
    }
}

