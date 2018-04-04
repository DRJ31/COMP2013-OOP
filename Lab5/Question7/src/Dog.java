public class Dog extends Animal {
    public Dog(String name, double weight) {
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
        super.setWeight(getWeight() + 2.0);
    }

    public static void testDog() {
        Dog d = new Dog("Woof", 2.0);
        System.out.println(d.getName() == "Woof");
        System.out.println(d.getWeight() == 2.0);
        //The name is still the name but the weight increased by 2.0
        d.feed();
        System.out.println(d.getName() == "Woof");
        System.out.println(d.getWeight() == 4.0);
    }
}
