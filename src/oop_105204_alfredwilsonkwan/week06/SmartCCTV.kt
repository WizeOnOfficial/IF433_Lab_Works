package oop_105204_alfredwilsonkwan.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("The CCTV '$name' has been turned on!")
        startRecord()
    }

    override fun turnOff() {
        println("The CCTV '$name' has been turned off!")
        stopRecord()
    }

    override fun startRecord() {
        println("This device is now recording!")
    }
}