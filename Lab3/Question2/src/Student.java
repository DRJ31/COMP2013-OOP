
public class Student {
    private int ID;
    public Student(int ID) {
    	if (ID <= 0) 
    		this.ID = 0;
    	else
    		this.ID = ID;
    }
    public int getID() {
        return ID;
    }
    public static void TestStudent() {
        
    }
}
