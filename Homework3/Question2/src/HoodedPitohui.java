public class HoodedPitohui extends Bird {
    public HoodedPitohui() {
        super("orange-black", 4000);
    }

    @Override
    public boolean isEdible() {
        return false;
    }

    public static void testHoodedPitohui() {
        HoodedPitohui hoodedPitohui = new HoodedPitohui();
        //Test hoodedPitohui
        System.out.println(hoodedPitohui.isEdible() == false);
        System.out.println(hoodedPitohui.getColor() == "orange-black");
        System.out.println(hoodedPitohui.getNumberOfFeathers() == 4000);
    }
}
