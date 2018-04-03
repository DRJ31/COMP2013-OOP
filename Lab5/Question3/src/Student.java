public class Student {
    private String name;
    private Cat pet;

    public Student(String name, Cat pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public Cat getPet() {
        return pet;
    }

    public static void testStudent() {
        Cat neko = new Cat("Neko", 2.33);
        Student stu = new Student("Max", neko);
        System.out.println(stu.getName() == "Max");
        System.out.println(stu.getPet().getName() == "Neko");
        System.out.println(stu.getPet().getWeight() == 2.33);
        stu.getPet().feed();
        System.out.println(stu.getPet().getWeight() == 3.33);
    }
}
