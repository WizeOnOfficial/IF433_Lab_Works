package oop_105204_alfredwilsonkwan.week03

class Weapon () {
    val name: String = "John Man"
    var damage: Int = 0
        set(value) {
            if(value < 0) println("Damage can't be negative")
            else if (value > 1000) field = 1000
            else field = value
        }

    val tier: String
        get() {
            if(damage > 800) return "Legendary"
            else if(damage > 500) return "Epic"
            else return "Common"
        }
}