public class Animal extends LivingThing{
    private double weight;

    public Animal(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void testAnimal() {
        Dog.testDog();
        Cat.testCat();
    }
}
