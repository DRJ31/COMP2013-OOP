open class Animal : LivingThing {
    private var weight: Double

    constructor(name: String, weight: Double) : super(name) {
        this.weight = weight
    }

    override fun getName(): String {
        return super.getName()
    }

    open fun getWeight(): Double {
        return weight
    }

    fun setWeight(weight: Double) {
        this.weight = weight
    }
}