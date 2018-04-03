public class Start {
    public static void main(String[] args) {
        Chicken.testChicken();
        Chicken bird = new Chicken("Lollipop");
        Student.testStudent();
        Student stu = new Student("Clear", bird);
        System.out.println(stu.getPet().getName() == "Lollipop");
        System.out.println(stu.getPet().getWeight() == 5.0);
    }
}
