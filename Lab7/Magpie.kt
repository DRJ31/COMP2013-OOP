class Magpie : Bird {
    constructor(name: String) : super(name, 6)

    override fun canFly(): Boolean {
        return true
    }

    companion object {
        fun testMagpie() {
            val magpie = Magpie("mag")
            println(magpie.getNumOfEggs() == 6)
            println(magpie.getName() == "mag")
            println(magpie.getLegs() == 2)
            println(magpie.isDangerous() == false)
            println(magpie.canFly() == true)
            val mag = Magpie("mp")
            println(mag.getName() == "mp")
            println(mag.isDangerous() == false)
            println(mag.canFly() == true)
        }
    }
}