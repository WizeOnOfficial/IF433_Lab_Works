package oop_105204_alfredwilsonkwan.week11

import oop_105204_alfredwilsonkwan.week06.SmartLamp

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(name = "Philips WiZ Living Room", category = "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
        println("Menambahkan Smart Lamp: $it")
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung.")
        homeDevices.add(it)
    }

    val acInverter = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }

    homeDevices.add(acInverter)
    homeDevices.add(SmartDevice("Picolo's Auto Feeder","Pet Care", true, 10))

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }
    searchResult?.let {
        println("\n=== Hasil Pencarian Kamera ===")
        println(it.diagnose())
    }

    with(homeDevices) {
        println("\nTotal Produk : ${this.size}")
    }

    val totalPower = homeDevices.run {
        println("\nTotal jumlah daya: ${sumOf { it.powerLoad }}")
    }
}