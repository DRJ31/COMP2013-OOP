open class Bird : Animal {
    private var altitude: Double

    constructor(name: String, weight: Double, altitude: Double) : super(name, weight) {
        this.altitude = altitude
    }

    fun getAltitude(): Double {
        return altitude
    }
}