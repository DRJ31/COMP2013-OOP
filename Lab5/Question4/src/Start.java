public class Start {
    public static void main(String[] args) {
    	Animal.testAnimal();
        Animal cat = new Cat("Neko", 2.33);
        //Test student with cat as pet
        Student stu = new Student("Andy", cat);
        //Test the information of student's pet
        System.out.println(stu.getPet().getName() == "Neko");
        System.out.println(stu.getPet().getWeight() == 2.33);
        Student.testStudent();
    }
}
