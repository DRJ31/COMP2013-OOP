class Dog : Animal {
    constructor(name: String) : super(name)

    override fun getLegs(): Int {
        return 4
    }

    override fun canFly(): Boolean {
        return false
    }

    companion object {
        fun testDog() {
            val dog = Dog("Inu")
            println(dog.getName() == "Inu")
            println(dog.canFly() == false)
            println(dog.getLegs() == 4)
        }
    }
}