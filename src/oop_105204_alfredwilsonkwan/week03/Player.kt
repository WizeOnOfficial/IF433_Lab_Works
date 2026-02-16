package oop_105204_alfredwilsonkwan.week03

class Player () {
    val username: String = "Mister Man"
    private var xp: Int = 0
    val level: Int
        get() {
            return xp / 100 + 1
        }

    fun addXp(amount: Int) {
        if (amount <= 0) return
        val curXp: Int = xp
        xp += amount

        if(curXp / 100 + 1 < level) {
            println("Level Up! Selamat $username naik ke level $level.")
        }
    }
}