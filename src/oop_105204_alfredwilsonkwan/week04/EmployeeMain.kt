package oop_105204_alfredwilsonkwan.week04

fun main() {
    println("\n--- Testing Manager Class ---")
    val mngr = Manager("Boss", 6000000)
    mngr.work()
    val mngrBonus = mngr.calculateBonus()
    println("${mngr.name} mendapatkan bonus sebesar $mngrBonus")

    println("\n--- Testing Developer Class ---")
    val dev = Developer("John Doe", 4500000, "Python")
    dev.work()
    val devBonus = dev.calculateBonus()
    println("${dev.name} mendapatkan bonus sebesar $devBonus")
}