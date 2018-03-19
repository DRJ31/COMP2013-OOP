public class Student {
    private int ID;
    private String name;
    private char grade = 'A';
    private boolean sleeping = false;
    public Student(int ID, String name) {
        if (ID <= 0)
            this.ID = 0;
        else
            this.ID = ID;
        this.name = name;
    }
    public Student(int ID, String name, char grade){
        if (ID <= 0)
            this.ID = 0;
        else
            this.ID = ID;
        this.name = name;
        this.grade = grade;
    }
    public int getID() {
        return ID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        this.grade = grade;
    }
    public boolean isSleeping(){
        return sleeping;
    }
    public void goToSleep(){
        sleeping = true;
        if (grade != 'F')
            grade++;
    }
    public void wakeUp(){
        sleeping = false;
    }
    public static void TestStudent() {

    }
}