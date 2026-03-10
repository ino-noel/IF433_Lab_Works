package oop_00000106169_InocentiusNoelPrasetya.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }

    println("\n=== TEST METHOD OVERLOADING ===")
    val math = MathHelper()
    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")
    val luasPersegiPanjang = math.hitungLuas(10, 4)
    println("Luas Persegi Panjang (10 x 4): $luasPersegiPanjang")
    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran (r=7.0): $luasLingkaran")

    println("\n=== SISTEM PEMBAYARAN ===")

    val ewallet = EWallet(accountName = "John Doe", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Jane Smith", limit = 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(ewallet, creditCard)

    println("--- Percobaan Pembayaran Rp 75.000 ---")
    for (payment in paymentMethods) {
        payment.processPayment(75000.0)

        if (payment is EWallet) {
            println("=> Terdeteksi sebagai E-Wallet. Melakukan top up otomatis...")
            payment.topUp(50000.0)
            println("=> Mencoba pembayaran ulang setelah top up:")
            payment.processPayment(75000.0)
        }

        println("-------------------------")
    }
}