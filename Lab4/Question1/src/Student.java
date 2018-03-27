
public class Student {
	private int ID;
	private boolean sleeping;

	public Student(int ID) {// Initialize student with ID
		this.ID = ID;
		sleeping = false;
	}

	public int getID() {// Get the ID of student
		return ID;
	}

	public boolean isSleeping() {// Check if the student is sleeping
		return sleeping;
	}

	public void fallAsleep() {// Make the student fall asleep
		if (!isSleeping())
			sleeping = true;
	}

	public void wakeUp() {// Make the student wake up
		if (isSleeping())
			sleeping = false;
	}

	public static void testStudent() {
		Student s = new Student(1234567890);
		//Testing get information functions
		System.out.println(s.getID() == 1234567890);
		System.out.println(s.isSleeping() == false);
		//Testing fall asleep function
		s.fallAsleep();
		System.out.println(s.isSleeping() == true);
		s.fallAsleep();
		System.out.println(s.isSleeping() == true);
		//Testing wakeUp function
		s.wakeUp();
		System.out.println(s.isSleeping() == false);
		s.wakeUp();
		System.out.println(s.isSleeping() == false);
	}
}
