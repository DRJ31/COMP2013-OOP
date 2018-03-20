class Student{
    private val ID: Int
    private var name: String
    private var grade: Char = 'A'
    private var sleeping: Boolean = false
    constructor(ID: Int, name: String){
        if (ID <= 0)
            this.ID = 0
        else
            this.ID = ID
        this.name = name
    }
    constructor(ID: Int, name: String, grade: Char){
        if (ID <= 0)
            this.ID = 0
        else
            this.ID = ID
        this.name = name
        this.grade = grade
    }
    fun getID(): Int{
        return ID
    }
    fun getName(): String{
        return name
    }
    fun setName(name: String){
        this.name = name
    }
    fun getGrade(): Char{
        return grade
    }
    fun setGrade(grade: Char){
        this.grade = grade
    }
    fun isSleeping(): Boolean{
        return sleeping
    }
    fun goToSleep(){
        sleeping = true
        if (grade != 'F')
            grade++
    }
    fun wakeUp(){
        sleeping = false
    }
    fun getAll(){
        println("Name: $name")
        println("ID: $ID")
        println("Grade: $grade")
    }
    companion object {
        fun TestStudent(){
            val stu1 = Student(3054, "Jingyu", 'C')
            val stu2 = Student(-1, "Andrew")
            println(stu1.getID() == 3054)
            println(stu1.getName() == "Jingyu")
            println(stu2.getID() == 0)
            println(stu2.getName() == "Andrew")
            stu1.setName("Bill")
            stu2.setName("Joseph")
            println(stu1.getName() == "Bill")
            println(stu2.getName() == "Joseph")
            stu1.setGrade('B')
            stu2.setGrade('C')
            println(stu1.getGrade() == 'B')
            println(stu2.getGrade() == 'C')
            stu2.goToSleep()
            println(stu1.isSleeping() == false)
            println(stu2.isSleeping() == true)
            println(stu2.getGrade() == 'D')
            stu2.wakeUp()
            println(stu2.isSleeping() == false)
            println(stu2.getGrade() == 'D')
        }
    }
}