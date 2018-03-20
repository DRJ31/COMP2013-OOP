
public class Student {
    private int ID;
    public Student(int ID) {//Initialize ID of student while initializing
    	if (ID <= 0) //Check if the ID is invalid
    		this.ID = 0;//If the ID is invalid, ID = 0
    	else
    		this.ID = ID;
    }
    public int getID() {//Get the ID of Students
        return ID;
    }
    public static void TestStudent() {
        Student stu1 = new Student(-1);//Initialize student with invalid ID
        Student stu2 = new Student(3054);
        System.out.println(stu1.getID() == 0);//Check if the ID is 0 if the ID is invalid
        System.out.println(stu2.getID() == 3054);//Check if the ID is correct
    }
}
