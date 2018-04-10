class GoldenDartFrog : Animal {
    constructor() : super("gold")

    override fun isEdible(): Boolean {
        return false
    }

    companion object {
        fun testGoldenDartFrog() {
            val frog = GoldenDartFrog()
            println(frog.isEdible() == false)
            println(frog.getColor() == "gold")
        }
    }
}