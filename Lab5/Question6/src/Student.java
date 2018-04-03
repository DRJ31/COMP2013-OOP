
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
		Chicken bird = new Chicken("Gugu");
		Student stu = new Student("Gigabyte", bird);
		//Test the information of student's pet
		System.out.println(stu.getPet().getWeight() == 5.0);
		System.out.println(stu.getPet().getName() == "Gugu");
		//Test the name of student
		System.out.println(stu.getName() == "Gigabyte");
	}
}
