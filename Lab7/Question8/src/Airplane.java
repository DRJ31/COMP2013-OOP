
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
	
	public static void testAirplane() {
		Airplane frank = new Airplane("Cathay Pacific");
		System.out.println(frank.canFly() == true);
		System.out.println(frank.getName() == "Cathay Pacific");
		Flyer ng = new Airplane("Shuyang");
		System.out.println(ng.getName() == "Shuyang");
		System.out.println(ng.canFly() == true);
	}
}
