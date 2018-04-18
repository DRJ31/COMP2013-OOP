class Fish : Swimmer {
    private val name: String
    private val friend: Swimmer

    constructor(name: String, friend: Swimmer) {
        this.name = name
        this.friend = friend
    }

    override fun getName(): String {
        return name
    }

    override fun getFriend(): Swimmer {
        return friend
    }

    companion object {
        fun testFish() {
            val j = Jellyfish("Andrew")
            val fish1 = Fish("BJMan", j)
            val fish2 = Fish("Max", fish1)
            println(j.getName() == "Andrew")
            println(j.getFriend() == j)
            println(fish1.getName() == "BJMan")
            println(fish1.getFriend() == j)
            println(fish2.getName() == "Max")
            println(fish2.getFriend() == fish1)
        }
    }
}