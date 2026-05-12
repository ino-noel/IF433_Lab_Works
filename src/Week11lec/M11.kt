package Week11lec

//function biasa
fun salam_pembuka (nama:String){
    if(nama=="budi gunawan"){
        println("Salam kenal")
    } else {
        println("ih kamu siapa")
    }
}

//function extesion - basic
fun String.rubah_huruf_depan_jadi_besar(): String{
    var hasil = this.split(" ").joinToString(" "){
        it.replaceFirstChar{
            c -> c.uppercase()
        }
    }
    return "Hai $hasil ";
}

//function extension - parameter
fun Int.tentukanGrade (namaMhs:String) {
    var hasilGrade = "E";
    if(this>=80){
        hasilGrade = "A"
    } else if(this>=70){
        hasilGrade = "B"
    } else {
        hasilGrade = "C"
    }
    println(namaMhs + "Grade kamu " + hasilGrade);
}

//function extesion - null
fun String?.cekNulldanEmpty():String{
    if(this==null || this.isEmpty()){
        return "Username gaboleh null / empty";
    } else {
        return "Username kamu $this"
    }
}

fun main (){
    //cara panggil function extension
    println("udin sedunia".rubah_huruf_depan_jadi_besar())

    //cara panggil function extension - parameter
    var hasilStr = 71.tentukanGrade("Eligrah");

    //cara panggil extension - null
    var usernameKamu:String? = null;
    println(usernameKamu.cekNulldanEmpty());
}