abstract class Bird : Animal, Flyer {
    private val numOfEggs: Int

    constructor(name: String, numOfEggs: Int) : super(name) {
        this.numOfEggs = numOfEggs
    }

    open fun getNumOfEggs(): Int {
        return numOfEggs
    }

    override fun getLegs(): Int {
        return 2
    }

    override fun isDangerous(): Boolean {
        return false
    }
}