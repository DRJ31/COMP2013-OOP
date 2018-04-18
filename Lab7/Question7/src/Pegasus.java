
public class Pegasus extends Bird {

	public Pegasus(String name) {
		super(name, 0);
	}

	@Override
	public boolean canFly() {
		return true;
	}

	@Override
	public int getNumOfEggs() {
		System.out.println("Pegasi do not lay eggs!");
		return super.getNumOfEggs();
	}

	@Override
	public int getLegs() {
		return 4;
	}
	
	public static void testPegasus() {
		Flyer pegasus = new Pegasus("peg");
		System.out.println(pegasus.canFly() == true);
		System.out.println(pegasus.getName() == "peg");
		Pegasus pegasus2 = new Pegasus("peggy");
		System.out.println(pegasus2.getName() == "peggy");
		System.out.println(pegasus2.canFly() == true);
		System.out.println(pegasus2.getNumOfEggs() == 0);
		System.out.println(pegasus2.getLegs() == 4);
	}
}
