class Pegasus : Bird {

    constructor(name: String) : super(name, 0)

    override fun canFly(): Boolean {
        return true
    }

    override fun getNumOfEggs(): Int {
        println("Pegasi do not lay eggs!")
        return super.getNumOfEggs()
    }

    override fun getLegs(): Int {
        return 4
    }

    companion object {
        fun testPegasus() {
            val pegasus = Pegasus("peg")
            println(pegasus.canFly() == true)
            println(pegasus.getName() == "peg")
            println(pegasus.getNumOfEggs() == 0)
            println(pegasus.getLegs() == 4)
            println(pegasus.isDangerous() == false)
            val peg: Flyer = Pegasus("pegasus")
            println(peg.isDangerous() == false)
            println(peg.canFly() == true)
            println(peg.getName() == "pegasus")
        }
    }
}