package oop_105204_alfredwilsonkwan.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("The Speaker '$name' has been turned on!")
    }

    override fun turnOff() {
        println("The Speaker '$name' has been turned off!")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}