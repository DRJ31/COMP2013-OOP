class HoodedPitohui : Bird {
    constructor() : super("orange-black", 4000)

    override fun isEdible(): Boolean {
        return false
    }

    companion object {
        fun testHoodedPitohui() {
            val hoodedPitohui = HoodedPitohui()
            println(hoodedPitohui.isEdible() == false)
            println(hoodedPitohui.getColor() == "orange-black")
            println(hoodedPitohui.getNumberOfFeathers() == 4000)
        }
    }
}