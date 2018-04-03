
public class Student extends LivingThing{
    private Animal pet;

    public Student(String name, Animal pet) {
        super(name);
        this.pet = pet;
    }

    @Override
    public String getName() {
        return super.getName();
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
