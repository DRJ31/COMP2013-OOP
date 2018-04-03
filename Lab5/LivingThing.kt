open class LivingThing {
    private val name: String

    constructor(name: String) {
        this.name = name
    }

    open fun getName(): String {
        return name
    }
}