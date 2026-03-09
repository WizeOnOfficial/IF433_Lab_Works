package oop_105204_alfredwilsonkwan.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("The $name has been turned on!")
    }

    override fun turnOff() {
        println("The $name has been turned off!")
    }
}