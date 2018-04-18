
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
		Pegasus pegasus = new Pegasus("peg");
		System.out.println(pegasus.canFly() == true);
		System.out.println(pegasus.getNumOfEggs() == 0);
		System.out.println(pegasus.getLegs() == 4);
		System.out.println(pegasus.getName() == "peg");
		Flyer peg = new Pegasus("pegasus");
		System.out.println(peg.canFly() == true);
		System.out.println(peg.getName() == "pegasus");
	}
}
