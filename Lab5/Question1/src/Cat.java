public class Cat {
    private String name;
    private double weight;

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void feed() {
        weight++;
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
