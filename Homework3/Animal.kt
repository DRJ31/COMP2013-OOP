open class Animal {
    private val color: String

    constructor(color: String) {
        this.color = color
    }

    fun getColor(): String {
        return color
    }

    open fun isEdible(): Boolean {
        println("Do not eat this!")
        return false
    }

    companion object {
        fun testAnimal() {
            val animal = Animal("green")
            println(animal.getColor() == "green")
            println(animal.isEdible() == false)
        }
    }
}