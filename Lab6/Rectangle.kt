open class Rectangle : Shape {
    private val width: Double
    private val length: Double

    constructor(x: Double, y: Double, width: Double, length: Double) : super(x, y) {
        this.width = width
        this.length = length
    }

    override fun area(): Double {
        return width * length
    }

    override fun toString(): String {
        return "${this.javaClass.name} has area ${area()}"
    }

    companion object {
        fun testRectangle() {
            val rectangle = Rectangle(2.0, 1.0, 3.0, 4.0)
            println(rectangle.getX() == 2.0)
            println(rectangle.getY() == 1.0)
            println(rectangle.area() == 12.0)
        }
    }
}