package oop_105204_alfredwilsonkwan.week02

class Hero(val name: String, var hp: Int = 100, val baseDamage: Int ) {
    fun attack(targetName: String) {
        println("$name Attacks $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp = if(hp - damage <= 0) 0 else hp - damage
    }

    fun isAlive(): Boolean {
        if(hp > 0) return true else return false
    }
}