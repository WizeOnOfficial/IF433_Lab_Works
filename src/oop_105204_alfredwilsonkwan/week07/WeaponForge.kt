package oop_105204_alfredwilsonkwan.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword() : Weapon {
            return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50)
        }

        fun forgeEpicSword() : Weapon {
            return Weapon(GameItem("Pedang Angkasa", 40, ItemRarity.EPIC), 170)
        }
    }
}