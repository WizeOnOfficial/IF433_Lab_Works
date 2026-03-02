package oop_105204_alfredwilsonkwan.week05

class CreditCard(val limit: Double, var usedAmount: Double = 0.0, accountName: String) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount < limit) {
            usedAmount += amount
            println("Updated Used Amount: $usedAmount")
        } else {
            println("Amount over limit, transaction failed.")
        }
    }
}