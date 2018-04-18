abstract class Animal {
    private val name: String

    constructor(name: String) {
        this.name = name
    }

    fun getName(): String {
        return name
    }

    abstract fun getLegs(): Int

    abstract fun canFly(): Boolean
}