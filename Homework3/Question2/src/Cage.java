public class Cage {
    private Bird bird;

    public Cage(Bird bird) {
        this.bird = bird;
    }

    public Bird getBird() {
        return bird;
    }

    public static void testCage() {
        HoodedPitohui h1 = new HoodedPitohui();
        Cage cage = new Cage(h1);
        HoodedPitohui h2 = (HoodedPitohui) cage.getBird();
        System.out.println(h1 == h2);
    }
}
