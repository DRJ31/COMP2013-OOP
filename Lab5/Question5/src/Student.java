
public class Student {
    private String name;
    private Animal pet;

    public Student(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public Animal getPet() {
        return pet;
    }

    public static void testStudent() {
        Bird bird = new Bird("Gugu", 1.0, 1070);
        Student stu = new Student("Gigabyte", bird);
        System.out.println(stu.getPet().getWeight() == 1.0);
        System.out.println(stu.getPet().getName() == "Gugu");
        System.out.println(stu.getName() == "Gigabyte");
    }
}
