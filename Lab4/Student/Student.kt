class Student {
    private val ID: Int
    private var sleeping: Boolean

    constructor(ID: Int) {
        this.ID = ID
        sleeping = false
    }

    fun getID(): Int {
        return ID
    }

    fun isSleeping(): Boolean {
        return sleeping
    }

    fun fallAsleep() {
        if (!isSleeping())
            sleeping = true
    }

    fun wakeUp() {
        if (isSleeping())
            sleeping = false
    }

    companion object {
        fun testStudent() {
            val stu = Student(1234567890)
            println(stu.getID() == 1234567890)
            println(stu.isSleeping() == false)
            stu.fallAsleep()
            println(stu.isSleeping() == true)
            stu.fallAsleep()
            println(stu.isSleeping() == true)
            stu.wakeUp()
            println(stu.isSleeping() == false)
            stu.wakeUp()
            println(stu.isSleeping() == false)
        }
    }
}