abstract class Shape {
    private var x: Double
    private var y: Double

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

    fun move(dx: Double, dy: Double) {
        x += dx
        y += dy
    }

    abstract fun area(): Double

    abstract fun resize(newSize: Double)
}