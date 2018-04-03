class Cat : Animal {
    constructor(name: String, weight: Double) : super(name, weight)

    override fun getName(): String {
        return super.getName()
    }

    override fun getWeight(): Double {
        return super.getWeight()
    }

    fun feed() {
        super.setWeight(1.0)
    }
}