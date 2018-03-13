fun oddNumber(){
    var sum = 0
    for (i in 1..100 step 2)
        sum += i
    println("The sum is $sum")
    println("The average is ${sum * 1.0 / 50}")
}

fun dividedBySeven(){
    var sum = 0
    val arr = Array(100, {i -> i}).filter { it % 7 == 0 }
    arr.forEach { sum += it }
    println("The sum is $sum")
    println("The average is ${sum * 1.0 / arr.size}")
}

fun squareSum(){
    var sum = 0
    val arr = Array(100, {i -> i * i })
    arr.forEach { sum += it }
    println("The result is $sum")
}
fun main(args: Array<String>){
    oddNumber()
    dividedBySeven()
    squareSum()
}