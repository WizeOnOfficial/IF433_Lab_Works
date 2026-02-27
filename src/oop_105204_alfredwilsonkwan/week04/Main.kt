package oop_105204_alfredwilsonkwan.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val eCar = ElectricCar("BYD", 4, 100)
    eCar.openTrunk()
    eCar.honk()
    eCar.accelerate()
}