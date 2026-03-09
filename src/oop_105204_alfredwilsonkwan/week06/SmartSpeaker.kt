package oop_105204_alfredwilsonkwan.week06

class SmartSpeaker : SmartDevice, Switchable {
    override val name: String = "SmartSpeaker"
    override val id: String = "SPEAKER"

    override fun turnOn() {
        println("The $name has been turned on!")
    }

    override fun turnOff() {
        println("The $name has been turned off!")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}