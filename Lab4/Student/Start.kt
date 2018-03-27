fun check(student: Student): String {
    return if (student.isSleeping()) "sweet dreams" else "need coffee"
}

fun main(args: Array<String>) {
    Student.Companion.testStudent()
    val s = Student(123)
    println(check(s))
}