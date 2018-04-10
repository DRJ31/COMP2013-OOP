class ManyShapes {
    private val allShapes: ArrayList<Shape>

    constructor() {
        allShapes = arrayListOf()
    }

    fun addShapes(s: Shape) {
        allShapes.add(s)
    }

    fun listAllShapes() {
        allShapes.forEach { println(it) }
    }

    companion object {
        fun testManyShapes() {
            val m = ManyShapes()
            m.addShapes(Circle(1.2, 3.4, 4.0))
            m.addShapes(Dot(1.2, 3.4))
            m.addShapes(Rectangle(1.2, 3.4, 4.0, 5.0))
            m.addShapes(Shape(1.2, 3.4))
            m.addShapes(Square(1.2, 3.4, 5.0))
            m.listAllShapes()
        }
    }
}