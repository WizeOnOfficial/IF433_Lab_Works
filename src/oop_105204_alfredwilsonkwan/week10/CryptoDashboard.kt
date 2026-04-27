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
}