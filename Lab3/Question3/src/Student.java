public class Student {
    private int ID;
    private String name;
    public Student(int ID, String name) {//Initialize Student with ID and name
        if (ID <= 0)//If ID is invalid, set it to 0
            this.ID = 0;
        else
            this.ID = ID;
        this.name = name;
    }
    public int getID() {//Get ID of this student
        return ID;
    }
    public String getName(){//Get the name of this student
        return name;
    }
    public void setName(String name){//Reset name of student
        this.name = name;
    }
    public static void TestStudent() {
    	Student stu1 = new Student(3054, "Jack Wu");
    	Student stu2 = new Student(-1, "Andrew");
    	System.out.println(stu1.getID() == 3054);//Check if the ID of student1 is correct
    	System.out.println(stu1.getName().equals("Jack Wu"));//Check if the name of student1 is correct
    	System.out.println(stu2.getID() == 0);//Check if the ID of student2 is 0
    	System.out.println(stu2.getName().equals("Andrew"));//Check if the name of student2 is correct
    	stu1.setName("Bill");//Reset the name of student1
    	stu2.setName("Joseph");//Reset the name of student2
    	System.out.println(stu1.getName().equals("Bill"));//Check if the name of student1 is reseted
    	System.out.println(stu2.getName().equals("Joseph"));//Check if the name of student2 is reseted
    }
}