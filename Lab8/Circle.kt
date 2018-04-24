import kotlin.math.PI

class Circle : Shape {
    private var radius: Double

    constructor(x: Double, y: Double, radius: Double) : super(x, y) {
        if (radius < 0)
            throw BadRadiusException()
        else
            this.radius = radius
    }

    override fun area(): Double {
        return PI * radius * radius
    }

    override fun resize(newSize: Double) {
        if (newSize < 0)
            throw BadRadiusException()
        else
            radius = newSize
    }

    companion object {
        fun testCircle() {
            try {
                val circle = Circle(1.0, 0.0, 4.0)
                println(circle.area() == 16 * PI)
                println(circle.getX() == 1.0)
                println(circle.getY() == 0.0)
                circle.move(2.0, 1.0)
                println(circle.getX() == 3.0)
                println(circle.getY() == 1.0)
                circle.resize(-1.0)
                println(circle.area() == 4 * PI)
            }
            catch (e: BadRadiusException) {
                println("Error: ${e.message}")
            }
        }
    }
}