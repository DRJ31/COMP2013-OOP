public class Fish implements Swimmer {
    private String name;
    private Swimmer friend;

    public Fish(String name, Swimmer friend) {
        this.name = name;
        this.friend = friend;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public Swimmer getFriend() {
        return friend;
    }

    public static void testFish() {
        Jellyfish j = new Jellyfish("Andrew");
        Fish fish1 = new Fish("BJMan", j);
        Fish fish2 = new Fish("Max", fish1);
        System.out.println(j.getName() == "Andrew");
        System.out.println(j.getFriend() == j);
        System.out.println(fish1.getName() == "BJMan");
        System.out.println(fish1.getFriend() == j);
        System.out.println(fish2.getName() == "Max");
        System.out.println(fish2.getFriend() == fish1);
    }
}
