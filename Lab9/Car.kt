class Car {
    private val name: String
    private val doors: ArrayList<Door>

    constructor(name: String, numberOfDoors: Int) {
        this.name = name
        if (numberOfDoors < 1)
            throw BadCarException()
        doors = arrayListOf()
        for (i in 1..numberOfDoors)
            doors.add(Door())
    }

    fun listDoors() {
        doors.forEach {
            print("$name: door is ")
            if (it.isOpen()) println("opened") else println("closed")
        }
    }

    fun countOpenDoors(): Int {
        var count = 0
        doors.forEach { if (it.isOpen()) count++ }
        return count
    }

    fun openOneDoor(doorNumber: Int) {
        if (doorNumber < 1 || doorNumber > doors.size) throw BadDoorException(doorNumber)
        if (!doors[doorNumber - 1].isOpen()) doors[doorNumber - 1].open()
    }

    fun changeAllDoors() {
        doors.forEach { if (it.isOpen()) it.close() else it.open() }
    }

    fun replaceDoor(doorNumber: Int) {
        if (doorNumber < 1 || doorNumber > doors.size)
            throw BadDoorException(doorNumber)
        doors[doorNumber - 1] = Door()
    }

    fun replaceAllDoors() {
        for (i in doors.indices) doors[i] = Door()
    }

    fun replaceManyDoors(numOfDoorsToReplace: Int) {
        for (i in 1..numOfDoorsToReplace) replaceDoor(i)
    }

    fun expandCar() {
        doors.add(Door())
        doors.add(Door())
    }

    companion object {
        fun testCar() {
            try {
                val lexus = Car("ES300h", 4)
                lexus.listDoors()
                println(lexus.countOpenDoors() == 0)
                lexus.openOneDoor(1)
                lexus.listDoors()
                println(lexus.countOpenDoors() == 1)
                lexus.changeAllDoors()
                lexus.listDoors()
                lexus.replaceDoor(3)
                println(lexus.countOpenDoors() == 2)
                lexus.listDoors()
                println("After replace all doors")
                lexus.replaceAllDoors()
                lexus.listDoors()
                println("After expand car")
                lexus.expandCar()
                lexus.listDoors()
                lexus.replaceManyDoors(5)
                lexus.openOneDoor(7)
            }
            catch (e: BadDoorException) { println(e.message) }
            catch (e: BadCarException) { println(e.message) }
        }
    }
}