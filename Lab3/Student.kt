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

        }
    }
}