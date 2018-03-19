
public class Student {
    private int ID;
    private String name;
    private char grade = 'A';
    public Student(int ID, String name) {
        if (ID <= 0)
            this.ID = 0;
        else
            this.ID = ID;
        this.name = name;
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
    public static void TestStudent() {

    }
}
