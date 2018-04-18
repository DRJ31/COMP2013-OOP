public class Jellyfish {
    private String name;

    public Jellyfish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Jellyfish getFriend() {
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
