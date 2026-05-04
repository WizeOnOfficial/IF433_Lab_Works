package oop_105204_alfredwilsonkwan.week11

import oop_105204_alfredwilsonkwan.week06.SmartLamp

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val smartLamp = SmartDevice(
        name = "Philips WiZ Living Room",
        category = "Lighting",
        isOnline = true,
        powerLoad = 12
    ).apply {

    }.also {
        homeDevices.add(it)
        println("Menambahkan Smart Lamp: $it")
    }
}