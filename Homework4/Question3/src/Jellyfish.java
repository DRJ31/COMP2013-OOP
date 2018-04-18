public class Jellyfish implements Swimmer {
    private String name;

    public Jellyfish(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Swimmer getFriend() {
        System.out.println("The friend of Jellyfish is itself.");
        return this;
    }

    public static void testJellyFish() {
        Jellyfish j = new Jellyfish("Blob");
        System.out.println(j.getName() == "Blob");
        //The friend of the jellyfish is the jellyfish itself
        System.out.println(j.getFriend() == j);
    }
}
