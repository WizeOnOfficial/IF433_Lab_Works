package oop_105204_alfredwilsonkwan.week04

class EWallet(var balance: Double, accountName: String) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance > amount) {
            balance -= amount
        } else {
            println("Insufficient balance.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
    }
}