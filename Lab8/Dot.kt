class Dot : Shape {
    constructor(x: Double, y: Double) : super(x, y)

    override fun area(): Double {
        return 0.0
    }

    override fun resize(newSize: Double) {
        throw CannotResizeException("Cannot resize a dot!")
    }

    companion object {
        fun testDot() {
            val dot = Dot(2.0, 1.0)
            println(dot.area() == 0.0)
            println(dot.getX() == 2.0)
            println(dot.getY() == 1.0)
            dot.move(1.0, 2.0)
            println(dot.getX() == 3.0)
            println(dot.getY() == 3.0)
            try {
                dot.resize(13.0)
            }
            catch (e: CannotResizeException) {
                println("Error: ${e.message}")
            }
        }
    }
}