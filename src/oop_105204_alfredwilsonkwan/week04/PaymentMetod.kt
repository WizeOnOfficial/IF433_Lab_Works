package oop_105204_alfredwilsonkwan.week04

abstract class PaymentMetod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}