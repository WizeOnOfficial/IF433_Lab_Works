package oop_105204_alfredwilsonkwan.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (d in devices) {
            if (d is Switchable) {
                d.turnOff()
            }
        }
    }

}