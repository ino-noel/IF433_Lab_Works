package oop_00000106169_InocentiusNoelPrasetya.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}