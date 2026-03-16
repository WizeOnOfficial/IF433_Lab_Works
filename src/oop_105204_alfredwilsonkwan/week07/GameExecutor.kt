package oop_105204_alfredwilsonkwan.week07

fun processEvent(event: BattleState) {
    when(event) {
        is MonsterEncounter -> println("Monster ${event.monsterName} menghalangi jalan!")
        is LootDropped -> println("Kamu menang! Monster menjatuhkan suatu loot! Kamu dapat ${event.item.name}, damage: ${event.item.damage}, rarity: ${event.item.rarity}")
        is GameOver -> println("Game Over! Kamu kalah.")
        SafeZone -> println("Kamu berada di suatu safe zone!")
    }
}
