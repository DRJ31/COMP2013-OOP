open class Rectangle : Shape {
    private var width: Double
    private var length: Double

    constructor(x: Double, y: Double, width: Double, length: Double) : super(x, y) {
        this.width = width
        this.length = length
    }

    override fun area(): Double {
        return width * length
    }

    override fun resize(newSize: Double) {
        width = newSize
        length = newSize
    }

    open fun resize(newWidth: Double, newLength: Double) {
        width = newWidth
        length = newLength
    }

    companion object {
        fun testRectangle() {
            val rectangle = Rectangle(1.0, 2.0, 3.0, 4.0)
            println(rectangle.area() == 12.0)
            println(rectangle.getX() == 1.0)
            println(rectangle.getY() == 2.0)
            rectangle.move(3.0, 4.0)
            println(rectangle.getX() == 4.0)
            println(rectangle.getY() == 6.0)
            rectangle.resize(5.0)
            println(rectangle.area() == 25.0)
            try {
                rectangle.resize(2.0, 3.0)
                println(rectangle.area() == 6.0)
            }
            catch (e: CannotResizeException) {
                println("Error: ${e.message}")
            }
        }
    }
}