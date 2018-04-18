class Airplane : Flyer {
    private val name: String

    constructor(name: String) {
        this.name = name
    }

    override fun canFly(): Boolean {
        return true
    }

    override fun getName(): String {
        return name
    }

    override fun isDangerous(): Boolean {
        return false
    }

    companion object {
        fun testAirplane() {
            val frank = Airplane("CathayPacific")
            println(frank.canFly() == true)
            println(frank.getName() == "CathayPacific")
            println(frank.isDangerous() == false)
            val ng: Flyer = Airplane("Shuyang")
            println(ng.canFly() == true)
            println(ng.getName() == "Shuyang")
            println(ng.isDangerous() == false)
        }
    }
}