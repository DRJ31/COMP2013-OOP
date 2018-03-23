public class Student {
    private int ID;
    private String name;
    private char grade = 'A';//Set the default grade A
    public Student(int ID, String name) {//Initialize student with ID and name
        if (ID <= 0)//Check if ID is invalid
            this.ID = 0;
        else
            this.ID = ID;
        this.name = name;
    }
    public Student(int ID, String name, char grade){//Initialize student with ID, name and grade
        if (ID <= 0)//Check if ID is invalid
            this.ID = 0;
        else
            this.ID = ID;
        this.name = name;
        this.grade = grade;
    }
    public int getID() {//Get the ID of student
        return ID;
    }
    public String getName(){//Get the name of student
        return name;
    }
    public void setName(String name){//Reset the name of student
        this.name = name;
    }
    public char getGrade(){//Get the grade of student
        return grade;
    }
    public void setGrade(char grade){//Reset the grade for student
    	if ((grade >= 'A' && grade <= 'D') || grade == 'F')//Check if the grade is valid
			this.grade = grade;
		else
			System.out.println("Invalid grade, now grade is still A");
    }
    public static void TestStudent() {
    	Student stu1 = new Student(3054, "Jingyu", 'C');//Reset student1 with grade
    	Student stu2 = new Student(-1, "Andrew");
    	System.out.println(stu1.getID() == 3054);//Check if the ID of student1 is correct
    	System.out.println(stu1.getName().equals("Jingyu"));//Check if the name of student1 is correct
    	System.out.println(stu2.getID() == 0);//Check if the ID of student2 is 0
    	System.out.println(stu2.getName().equals("Andrew"));//Check if the name of student2 is correct
    	stu1.setName("Bill");//Reset the name of student1
    	stu2.setName("Joseph");//Reset the name of student2
    	System.out.println(stu1.getName().equals("Bill"));//Check if the name of student1 has reset
    	System.out.println(stu2.getName().equals("Joseph"));//Check if the name of student2 has reset
    	System.out.println(stu1.getGrade() == 'C');//Check if the initialize of student1's grade is successful
    	stu1.setGrade('B');//Reset the grade of student1
    	stu2.setGrade('C');//Reset the grade of student2
    	System.out.println(stu1.getGrade() == 'B');//Check if the grade of student1 is reset successfully
    	System.out.println(stu2.getGrade() == 'C');//Check if the grade of student2 is reset successfully
    }
}