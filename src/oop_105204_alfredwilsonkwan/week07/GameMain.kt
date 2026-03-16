package oop_105204_alfredwilsonkwan.week07

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== LOOT RARITY CHECK ===")
    println("Legendary drop chance adalah: ${ItemRarity.LEGENDARY.dropChance}")

    println("\n=== FORGE CHECK ===")
    val mySword = Weapon.forgeStarterSword()
    println(mySword.item)
}