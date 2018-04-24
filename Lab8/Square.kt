class Square : Rectangle {
    constructor(x: Double, y: Double, size: Double) : super(x, y, size, size)

    override fun resize(newWidth: Double, newLength: Double) {
        if (newLength != newWidth)
            throw CannotResizeException("Cannot resize a square into a rectangle!")
        else
            resize(newWidth, newLength)
    }

    companion object {
        fun testSquare() {
            val square = Square(1.0, 2.0, 3.0)
            println(square.area() == 9.0)
            println(square.getX() == 1.0)
            println(square.getY() == 2.0)
            square.move(3.0, 4.0)
            println(square.getX() == 4.0)
            println(square.getY() == 6.0)
            square.resize(5.0)
            try {
                square.resize(2.0, 3.0)
            }
            catch (e: CannotResizeException) {
                println("Error: ${e.message}")
            }
        }
    }
}