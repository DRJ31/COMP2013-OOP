open class Student : LivingThing {
    private val pet: Animal

    constructor(name: String, pet: Animal) : super(name) {
        this.pet = pet
    }

    override fun getName(): String {
        return super.getName()
    }

    fun getPet(): Animal {
        return pet
    }
}