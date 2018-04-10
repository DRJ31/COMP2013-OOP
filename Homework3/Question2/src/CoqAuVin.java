public class CoqAuVin extends Chicken {
    public CoqAuVin() {
        super("brown", 0);
    }

    public static void testCoqAuVin() {
        CoqAuVin coq = new CoqAuVin();
        //Test coqauvin
        System.out.println(coq.getColor() == "brown");
        System.out.println(coq.getNumberOfFeathers() == 0);
        System.out.println(coq.isEdible() == true);
    }
}
