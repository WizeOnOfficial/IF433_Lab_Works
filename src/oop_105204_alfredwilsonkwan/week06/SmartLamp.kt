package oop_105204_alfredwilsonkwan.week06

class SmartLamp : SmartDevice, Switchable {
    override val name: String = "SmartLamp"
    override val id: String = "LAMP"

    override fun turnOn() {
        println("The $name has been turned on!")
    }

    override fun turnOff() {
        println("The $name has been turned off!")
    }
}