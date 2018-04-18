public class Magpie extends Bird {
    public Magpie(String name) {
        super(name, 6);
    }
    
    @Override
    public boolean canFly() {
    	return true;
    }
    public static void testMagpie() {
        Flyer magpie = new Magpie("Minami");
        System.out.println(magpie.getName() == "Minami");
        System.out.println(magpie.canFly() == true);
        Magpie magpie2 = new Magpie("Kotori");
        System.out.println(magpie2.canFly() == true);
        System.out.println(magpie2.getName() == "Kotori");
        System.out.println(magpie2.getNumOfEggs() == 6);
        System.out.println(magpie2.getLegs() == 2);
    }
}
