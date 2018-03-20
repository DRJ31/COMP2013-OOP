
public class Student {
    private int ID;
    public Student(int ID) {//Set ID of student while initialize the object
        this.ID = ID;
    }
    public int getID() {//Get the ID of Students
        return ID;
    }
    public static void TestStudent() {
        Student stu1 = new Student(3037);
        System.out.println(stu1.getID() == 3037);//Test the student's ID
    }
}
