package oop_105204_alfredwilsonkwan.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (d in devices) {
            if (d is Switchable) { d.turnOff() }
        }
    }

    fun activateSecurityMode() {
        for (d in devices) {
            if (d is Recordable) { d.startRecord() }
            if (d is SmartSpeaker) { d.playMusic("Sirine Peringatan") }
        }
    }
}

fun main() {
    val myLamp = SmartLamp("L01", "Ruang Tamu")
    val mySpeaker = SmartSpeaker("S01", "Google Nest Dapur")
    val myCCTV = SmartCCTV("C01", "Ezviv Garasi")
}