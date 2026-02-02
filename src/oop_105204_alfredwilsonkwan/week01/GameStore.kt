package oop_105204_alfredwilsonkwan.week01

fun main() {
    val gameTitle = "Persona 5 Royal"
    val price = 540000

    printReceipt(title = gameTitle, finalPrice = price)
}

fun calculateDiscount(price: Int) = if(price > 500000) price - price * 0.2 else price - price * 0.1

fun printReceipt(title: String, finalPrice: Int) {
    println("Game title: $title, Final price after Discount: ${calculateDiscount(finalPrice)}")
}