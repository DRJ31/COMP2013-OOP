public class LivingThing {
    private String name;

    public LivingThing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void testLivingThing() {
        LivingThing person = new LivingThing("Saber");
        //Test the name of LivingThing
        System.out.println(person.getName() == "Saber");
    }
}
