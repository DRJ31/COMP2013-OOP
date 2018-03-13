import java.util.*

fun InchesToMeters(){
    print("Input a value for inches: ")
    val input = Scanner(System.`in`)
    val inch = input.nextDouble()
    println("$inch inches is ${inch * 0.0254} meters.")
}

fun SumOfDigits(){
    val input = Scanner(System.`in`)
    var num: Int
    var result = 0
    while (true){
        print("Input an integer between 0 and 1000: ")
        num = input.nextInt()
        if (num in 0..1000) break
        println("The number should be between 0 and 1000!")
    }
    val save = num //Save the value of number
    while (num > 0){
        result += num % 10
        num /= 10
    }
    println("The sum of all digits in $save is $result")
}

fun CheckPassFail(){
    val input = Scanner(System.`in`)
    print("Enter your score: ")
    val score = input.nextInt()
    if (score >= 50)
        println("PASS")
    else
        println("FAIL")
    println("DONE")
}

fun CheckOddEven(){
    val input = Scanner(System.`in`)
    val number = input.nextInt()
    if (number % 2 == 0)
        println("Even Number")
    else
        println("Odd Number")
    println("BYE!")
}

fun PrintNumberInWord(){
    val input = Scanner(System.`in`)
    print("Enter a number: ")
    val number = input.nextInt()
    val str = when (number){
        1   -> "ONE"
        2   -> "TWO"
        3   -> "THREE"
        4   -> "FOUR"
        5   -> "FIVE"
        6   -> "SIX"
        7   -> "SEVEN"
        8   -> "EIGHT"
        9   -> "NINE"
        else-> "OTHER"
    }
    println(str)
}

fun SumAndAverage(){
    var sum = 0
    for (i in 1..100){
        sum += i
    }
    println("The sum is $sum")
    println("The average is ${sum * 1.0 / 100}")
}

fun ReverseString(){
    val input = Scanner(System.`in`)
    print("Enter a string: ")
    val inStr = input.next()
    println("The reverse of the string \"$inStr\" is \"${inStr.reversed()}\"")
}

fun TestPalindrome(){
    val input = Scanner(System.`in`)
    print("Enter a string: ")
    var str = input.next()
    str = str.toLowerCase()
    val length = str.length / 2
    for (i  in 0..length){
        if (str[i] != str[str.length - 1 - i]){
            println("This is not a palindrome")
            return
        }
    }
    println("This is a palindrome")
}

fun GradeAverage(){
    val input = Scanner(System.`in`)
    print("Enter the number of students: ")
    val numStudents = input.nextInt()
    val grades = arrayOfNulls<Int>(numStudents)
    var index = 0
    var sum = 0
    while (index < grades.size){
        print("Enter the grade of student ${index + 1}: ")
        grades[index] = input.nextInt()
        if (grades[index] in 0..100){
            if (grades[index] != null)
                sum += grades[index] as Int
            index++
            continue
        }
        println("Invalid grade, try again...")
    }
    println("The average is: ${sum * 1.0 / numStudents}")
}

fun main(args: Array<String>){
    InchesToMeters()
    SumOfDigits()
    CheckPassFail()
    CheckOddEven()
    PrintNumberInWord()
    SumAndAverage()
    ReverseString()
    TestPalindrome()
    GradeAverage()
}