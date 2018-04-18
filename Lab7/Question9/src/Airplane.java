
public class Airplane implements Flyer {
	private String name;

	public Airplane(String name) {
		this.name = name;
	}
	
	@Override
	public boolean canFly() {
		return true;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public boolean isDangerous() {
		return false;
	}
	
	public static void testAirplane() {
		Airplane frank = new Airplane("Cathay Pacific");
		System.out.println(frank.canFly() == true);
		System.out.println(frank.getName() == "Cathay Pacific");
		System.out.println(frank.isDangerous() == false);
		Flyer ng = new Airplane("Shuyang");
		System.out.println(ng.canFly() == true);
		System.out.println(ng.isDangerous() == false);
		System.out.println(ng.getName() == "Shuyang");
	}
}
