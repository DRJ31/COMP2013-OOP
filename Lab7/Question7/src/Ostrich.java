public class Ostrich extends Bird {
	public Ostrich(String name) {
		super(name, 10);
	}

	@Override
	public boolean canFly() {
		return false;
	}

	public static void testOstrich() {
		Flyer ostrich = new Ostrich("Minami");
		System.out.println(ostrich.getName() == "Minami");
		System.out.println(ostrich.canFly() == false);
		Ostrich ostrich2 = new Ostrich("Ost");
		System.out.println(ostrich2.getName() == "Ost");
		System.out.println(ostrich2.canFly() == false);
		System.out.println(ostrich2.getNumOfEggs() == 10);
		System.out.println(ostrich2.getLegs() == 2);
	}
}
