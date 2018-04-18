class Ostrich : Bird {
    constructor(name: String) : super(name, 10)

    override fun canFly(): Boolean {
        return false
    }

    override fun isDangerous(): Boolean {
        return true
    }

    companion object {
        fun testOstrich() {
            val ostrich = Ostrich("Minami")
            println(ostrich.getName() == "Minami")
            println(ostrich.canFly() == false)
            println(ostrich.getLegs() == 2)
            println(ostrich.isDangerous() == true)
            println(ostrich.getNumOfEggs() == 10)
            val ost: Flyer = Ostrich("ost")
            println(ost.getName() == "ost")
            println(ost.canFly() == false)
            println(ost.isDangerous() == true)
        }
    }
}