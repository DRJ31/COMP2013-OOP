public class Cat extends Animal{
    public Cat(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    public void feed() {
        super.setWeight(1.0);
    }

    public static void testCat() {
        Cat c = new Cat("Meow", 2.0);
        System.out.println(c.getName() == "Meow");
        System.out.println(c.getWeight() == 2.0);
        c.feed();
        //The name is still the name but the weight increased by 1.0
        System.out.println(c.getName() == "Meow");
        System.out.println(c.getWeight() == 3.0);
    }
}
