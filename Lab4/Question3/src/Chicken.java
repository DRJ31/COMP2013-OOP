
public class Chicken {
	private double weight;
	private boolean sleeping;

	public Chicken(double weight) {// Initialize chicken with weight
		this.weight = weight;
		sleeping = true;
	}

	public double getWeight() {// Obtain the weight of this chicken
		return weight;
	}

	public boolean isSleeping() {// Check if the chicken is asleep
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
		//Testing get information function
		System.out.println(c.getWeight() == 2.3);
		System.out.println(c.isSleeping() == true);
		//Testing wakeUp function
		c.wakeUp();
		System.out.println(c.isSleeping() == false);
		c.wakeUp();
		System.out.println(c.isSleeping() == false);
		//Testing fallAsleep function
		c.fallAsleep();
		System.out.println(c.isSleeping() == true);
		c.fallAsleep();
		System.out.println(c.isSleeping() == true);
	}
}
