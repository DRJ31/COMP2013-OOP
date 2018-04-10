class Dot : Shape {
    constructor(x: Double, y: Double) : super(x, y)

    override fun area(): Double {
        return 0.0
    }

    override fun toString(): String {
        return "${this.javaClass.name} has area ${area()}"
    }

    companion object {
        fun testDot() {
            val dot = Dot(1.0, 2.0)
            println(dot.getX() == 1.0)
            println(dot.getY() == 2.0)
            println(dot.area() == 0.0)
        }
    }
}