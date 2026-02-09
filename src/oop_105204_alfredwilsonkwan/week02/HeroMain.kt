package oop_105204_alfredwilsonkwan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var enemyHp = 100

    println("--- Hero Combat System ---")

    print("Enter Hero's Name: ")
    val name = scanner.nextLine()

    print("Enter Hero's Base Damage: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine()

    var hero = Hero(name = name, baseDamage = baseDamage)

    while(hero.isAlive() && enemyHp > 0) {
        print("Select your action: 1. Attack, 2. Escape: ")
        var action = scanner.nextInt()
        scanner.nextLine()

        when (action) {
            1 -> {
                enemyHp = enemyHp - baseDamage
                hero.attack("Enemy")
                println("Enemy's HP is $enemyHp")
                println()
            }
            2 -> {
                println("The Hero successfully escapes!")
                break
            }
        }

        if (enemyHp > 0) {
            println("The enemy attacks!")
            hero.takeDamage((10..20).random())
            println("The Hero's HP is now: ${hero.hp}")
            println()
        }
    }

    if(enemyHp <= 0) {
        println("The Hero defeats the Enemy! You Win!")
    } else {
        println("You have fled the battle.")
    }
}