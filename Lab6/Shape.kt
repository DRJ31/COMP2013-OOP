open class Shape {
    private val x: Double
    private val y: Double

    constructor(x: Double, y: Double) {
        this.x = x
        this.y = y
    }

    fun getX(): Double {
        return x
    }

    fun getY(): Double {
        return y
    }

    open fun area(): Double {
        println("An unknown shape has an unknown area!")
        return 0.0
    }

    override fun toString(): String {
        return "Shape has area 0.0"
    }

    companion object {
        fun testShape() {
            val shape = Shape(1.0, 2.0)
            println(shape.getX() == 1.0)
            println(shape.getY() == 2.0)
            println(shape.area() == 0.0)
        }
    }
}