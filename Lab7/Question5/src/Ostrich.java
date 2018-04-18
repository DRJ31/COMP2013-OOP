public class Ostrich extends Bird {
	public Ostrich(String name) {
		super(name, 10);
	}

	@Override
	public boolean canFly() {
		return false;
	}

	public static void testOstrich() {
		Ostrich ostrich = new Ostrich("Minami");
		System.out.println(ostrich.getName() == "Minami");
		System.out.println(ostrich.getLegs() == 2);
		System.out.println(ostrich.getNumOfEggs() == 10);
		System.out.println(ostrich.canFly() == false);
	}
}
