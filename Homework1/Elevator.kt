class Elevator{
    private var doorOpen: Boolean
    private var floor: Int
    constructor(){
        doorOpen = true
        floor = 1
    }
    fun isDoorOpen(): Boolean{
        return doorOpen
    }
    fun openDoor(){
        if (!doorOpen)
            doorOpen = true
    }
    fun closeDoor(){
        if (doorOpen)
            doorOpen = false
    }
    fun getFloor(): Int{
        return floor
    }
    fun moveUp(){
        if (doorOpen){
            println("Cannot move up when the door is open.")
            return
        }
        if (floor == 10){
            println("Canoot move higher than 10th floor.")
            return
        }
        floor++
    }
    fun moveDown(){
        if (doorOpen)
            println("Cannot move down when the door is open.")
        else if (floor == 1)
            println("Canoot move below ground floor.")
        else
            floor--
    }
    fun moveToFloor(floor: Int){
        if (doorOpen){
            println("Cannot move to another floor when the door is open.")
            return
        }
        when (floor){
            !in 1..10 -> println("Cannot move to floor $floor.")
            this.floor -> println("Cannot move to the same floor")
            else -> this.floor = floor
        }
    }
    companion object {
        fun TestElevator(){
            val elevator = Elevator()
            println(elevator.isDoorOpen())
            elevator.moveUp()
            elevator.closeDoor()
            elevator.moveDown()
            elevator.moveToFloor(12)
            elevator.moveToFloor(10)
            println(elevator.getFloor() == 10)
            elevator.moveUp()
        }
    }
}