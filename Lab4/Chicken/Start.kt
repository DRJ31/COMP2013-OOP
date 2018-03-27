fun check(chicken: Chicken): String {
    return if (chicken.isSleeping()) "sweet dreams" else "need coffee"
}

fun main(args: Array<String>) {
    Chicken.testChicken()
    val c = Chicken(2.3)
    println(check(c))
}