package oop_105204_alfredwilsonkwan.week03

fun main() {
    val player = Player()
//    println("Player XP: ${player.xp}")

    println("--- Selamat Datang ----")
    println("Sekarang, ${player.username} berada di level: ${player.level}")

    player.addXp(50)
    player.addXp(60)
}