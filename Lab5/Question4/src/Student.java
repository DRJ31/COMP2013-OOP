/*
 * We can use both cat and dog as pet of student because they are both inheritance from student
 */
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
        Animal neko = new Animal("Neko", 2.33);
        Student stu = new Student("Max", neko);
        System.out.println(stu.getName() == "Max");
        System.out.println(stu.getPet().getName() == "Neko");
        System.out.println(stu.getPet().getWeight() == 2.33);
    }
}
