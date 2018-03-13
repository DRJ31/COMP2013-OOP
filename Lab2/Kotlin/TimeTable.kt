fun main(args: Array<String>){
    //Print the first line
    print("* |")
    for (i in 1..9){
        print("\t$i")
    }
    println()
    //Print the line
    for (i in 1..39)
        print("-")
    println()
    //Print main content of table
    for (i in 1..9){
        print("$i |")
        for (j in 1..9){
            print("\t${i * j}")
        }
        println()
    }
}