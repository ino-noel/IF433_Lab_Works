package Week4lec

class Baju : Pakaian() {
    private var stock : Int = 10;
    public fun update_stock(terjual : Int){
        super.harga = stock * 100 ;
        println("Stock $stock baju terupdate," + "harga ${super.harga}");
    }
}