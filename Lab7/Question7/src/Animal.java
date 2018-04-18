public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getLegs();
    //getLegs should be abstract because there is no leg variable in Animal

    public abstract boolean canFly();
    //canFly should be abstract because there is no fly variable in Animal

    public static void testAnimal() {
        System.out.println("Animal is abstract and can't be initialized, therefore we can't test Animal.");
    }
}