package oop_105204_alfredwilsonkwan.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    val BTC = Coin("BTC", 200000.0)
    val ETH = Coin("ETH", 125000.0)
    val USDT = Coin("USDT", 345000.0)

    coinRepo.add(BTC)
    coinRepo.add(ETH)
    coinRepo.add(USDT)

    val response = ApiResponse("200 OK", coinRepo.getAll())

    response.data.forEach {
        println("Nama Coin: ${it.name}, Balance: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    val log1 = Transaction("BTC", 25000.0)
    val log2 = Transaction("ETH", 12500.0)
    val log3 = Transaction("USDT", 5000.0)

    txRepo.add(log1)
    txRepo.add(log2)
    txRepo.add(log3)

    val logResponse = ApiResponse("200 OK", txRepo.getAll())

    logResponse.data.forEach {
        println("Log: ID - ${it.id}, Spent - ${it.amount}")
    }
}