public class Magpie extends Bird {
    public Magpie(String name) {
        super(name, 6);
    }
    
    @Override
    public boolean canFly() {
    	return true;
    }
    public static void testMagpie() {
        Magpie magpie = new Magpie("Minami");
        System.out.println(magpie.getName() == "Minami");
        System.out.println(magpie.getLegs() == 2);
        System.out.println(magpie.getNumOfEggs() == 6);
        System.out.println(magpie.canFly() == true);
    }
}
