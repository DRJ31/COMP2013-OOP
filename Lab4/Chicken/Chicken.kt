class Chicken {
    private var weight: Double
    private var sleeping: Boolean

    constructor(weight: Double) {
        this.weight = weight
        sleeping = true
    }

    fun getWeight(): Double {
        return weight
    }

    fun isSleeping(): Boolean {
        return sleeping
    }

    fun fallAsleep() {
        if (!isSleeping())
            sleeping = true
    }

    fun wakeUp() {
        if (isSleeping())
            sleeping = false
    }

    companion object {
        fun testChicken() {
            val c = Chicken(2.3)
            println(c.getWeight() == 2.3)
            println(c.isSleeping() == true)
            c.wakeUp()
            println(c.isSleeping() == false)
            c.wakeUp()
            println(c.isSleeping() == false)
            c.fallAsleep()
            println(c.isSleeping() == true)
            c.fallAsleep()
            println(c.isSleeping() == true)
        }
    }
}