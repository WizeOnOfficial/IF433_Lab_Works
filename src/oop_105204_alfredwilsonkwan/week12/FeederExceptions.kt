package oop_105204_alfredwilsonkwan.week12

sealed class FeederException(msg: String) : Exception(msg)

class FoodEmptyException(requested: Int, available: Int) : FeederException(
    "Kibble tidak cukup! Diminta $requested gr, sisa $available gr"
)

class DispenserJamException : FeederException(
    "Wadah dispensser tersangkut/macet!"
)