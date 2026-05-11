package oop_105204_alfredwilsonkwan.week12

class InsufficientFundsException (
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")