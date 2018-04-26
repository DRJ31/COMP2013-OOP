class Door {
    private var isOpen: Boolean

    constructor() {
        this.isOpen = false
    }

    fun isOpen(): Boolean {
        return isOpen
    }

    fun open() {
        isOpen = true
    }

    fun close() {
        isOpen = false
    }

    companion object {
        fun testDoor() {
            val boyNext = Door()
            println(boyNext.isOpen() == false)
            boyNext.open()
            println(boyNext.isOpen() == true)
            boyNext.close()
            println(boyNext.isOpen() == false)
        }
    }
}