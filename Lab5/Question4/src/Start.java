public class Start {
    public static void main(String[] args) {
        Animal.testAnimal();
        Animal bird = new Animal("Lollipop", 1.0);
        Student.testStudent();
        Student stu = new Student("Clear", bird);
        System.out.println(stu.getPet().getName() == "Lollipop");
        System.out.println(stu.getPet().getWeight() == 1.0);
    }
}
