class Jellyfish : Swimmer {
    private val name: String

    constructor(name: String) {
        this.name = name
    }

    override fun getName(): String {
        return name
    }

    override fun getFriend(): Swimmer {
        println("The friend of Jellyfish is itself.")
        return this
    }

    companion object {
        fun testJellyfish() {
            val j = Jellyfish("Blob")
            println(j.getName() == "Blob")
            println(j.getFriend() == j)
        }
    }
}