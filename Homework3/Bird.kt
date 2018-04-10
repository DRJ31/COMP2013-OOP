open class Bird : Animal {
    private val numberOfFeathers: Int

    constructor(color: String, numberOfFeathers: Int) : super(color) {
        this.numberOfFeathers = numberOfFeathers
    }

    fun getNumberOfFeathers(): Int {
        return numberOfFeathers
    }

    override fun isEdible(): Boolean {
        return true
    }

    companion object {
        fun testBird() {
            val bird = Bird("orange", 8700)
            println(bird.getNumberOfFeathers() == 8700)
            println(bird.isEdible() == true)
            println(bird.getColor() == "orange")
        }
    }
}