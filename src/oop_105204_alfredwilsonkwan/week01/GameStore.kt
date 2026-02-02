package oop_105204_alfredwilsonkwan.week01

fun main() {
    val gameTitle = "Persona 5 Royal"
    val price = 540000
}

fun calculateDiscount(price: Int) = if(price > 500000) price - price * 0.2 else price - price * 0.1