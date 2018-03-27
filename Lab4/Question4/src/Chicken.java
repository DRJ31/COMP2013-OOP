
public class Chicken {
	private double weight;
	private boolean sleeping;

	public Chicken(double weight) {// Initialize Chicken with weight
		this.weight = weight;
		sleeping = true;
	}

	public double getWeight() {// Obtain the weight of chicken
		return weight;
	}

	public boolean isSleeping() {// Check if chicken is asleep
		return sleeping;
	}

	public void fallAsleep() {// Make the chicken fall asleep
		if (!isSleeping())
			sleeping = true;
	}

	public void wakeUp() {// Make the chicken wake up
		if (isSleeping())
			sleeping = false;
	}

	public static void testChicken() {
		Chicken c = new Chicken(2.3);

		System.out.println(c.getWeight() == 2.3);
		System.out.println(c.isSleeping() == true);
		c.wakeUp();
		System.out.println(c.isSleeping() == false);
		c.wakeUp();
		System.out.println(c.isSleeping() == false);
		c.fallAsleep();
		System.out.println(c.isSleeping() == true);
		c.fallAsleep();
		System.out.println(c.isSleeping() == true);
	}
}