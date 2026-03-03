package Week4lec

class Celana : Pakaian (){
    private var stock : Int = 20;
    public fun update_stock(){
        super.harga = stock * 120 ;
        println("stock $stock celana terupdate," + "harga ${super.harga}");
    }
}