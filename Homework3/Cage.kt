class Cage {
    private val bird: Bird

    constructor(bird: Bird) {
        this.bird = bird
    }

    fun getBird(): Bird {
        return bird
    }

    companion object {
        fun testCage() {
            val h1 = HoodedPitohui()
            val cage = Cage(h1)
            val h2 = cage.getBird()
            println(h1 == h2)
        }
    }
}