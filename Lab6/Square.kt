class Square : Rectangle {
    constructor(x: Double, y: Double, sideLength: Double) : super(x, y, sideLength, sideLength)

    override fun toString(): String {
        return "${this.javaClass.name} has area ${area()}"
    }

    companion object {
        fun testSquare() {
            val square = Square(1.0, 2.0, 3.0)
            println(square.getX() == 1.0)
            println(square.getY() == 2.0)
            println(square.area() == 9.0)
        }
    }
}