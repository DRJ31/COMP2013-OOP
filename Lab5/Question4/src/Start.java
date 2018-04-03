public class Start {
    public static void main(String[] args) {
        Bird.testBird();
        Bird bird = new Bird("Lollipop", 1.0, 1060);
        Student.testStudent();
        Student stu = new Student("Clear", bird);
        System.out.println(stu.getPet().getName() == "Lollipop");
        System.out.println(stu.getPet().getWeight() == 1.0);
    }
}
