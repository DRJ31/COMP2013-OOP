class CoqAuVin : Chicken {
    constructor() : super("brown", 0)

    companion object {
        fun testCoqAuVin() {
            val coqAuVin = CoqAuVin()
            println(coqAuVin.getColor() == "brown")
            println(coqAuVin.getNumberOfFeathers() == 0)
            println(coqAuVin.isEdible() == true)
        }
    }
}