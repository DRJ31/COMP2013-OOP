import kotlin.math.PI

class Circle : Shape {
    private val radius: Double

    constructor(x: Double, y: Double, radius: Double) : super(x, y) {
        this.radius = radius
    }

    override fun area(): Double {
        return PI * radius * radius
    }

    override fun toString(): String {
        return "${this.javaClass.name} has area ${area()}"
    }

    companion object {
        fun testCircle() {
            val circle = Circle(2.0, 4.0, 3.0)
            println(circle.getX() == 2.0)
            println(circle.getY() == 4.0)
            println(circle.area() == 9 * PI)
        }
    }
}