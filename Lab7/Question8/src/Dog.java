public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public int getLegs() {
        return 4;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    public static void testDog() {
        Dog dog = new Dog("Inu");
        System.out.println(dog.getName() == "Inu");
        System.out.println(dog.canFly() == false);
        System.out.println(dog.getLegs() == 4);
    }
}
