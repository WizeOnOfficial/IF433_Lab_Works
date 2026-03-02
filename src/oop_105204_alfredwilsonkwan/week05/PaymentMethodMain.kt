package oop_105204_alfredwilsonkwan.week05

fun main() {
    val ovo: PaymentMethod = EWallet(balance = 50000.0, accountName = "Wilson")
    val bca: PaymentMethod = CreditCard(limit = 100000.0, accountName = "Wilson")

    println("--- Wallet Manager ---")

    val walletList: List<PaymentMethod> = listOf(ovo, bca)

    for (wallet in walletList) {
        when (wallet) {
            is EWallet -> {
                wallet.topUp(50000.0)
                wallet.processPayment(75000.0)
            }

            is CreditCard -> {
                wallet.processPayment(75000.0)
            }
        }
    }
}