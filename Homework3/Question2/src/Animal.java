public class Animal {
    private String color;

    public Animal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isEdible() {
        System.out.println("Do not eat this!");
        return false;
    }

    public static void testAnimal() {
        Animal animal = new Animal("green");
        System.out.println(animal.getColor() == "green");
        System.out.println(animal.isEdible() == false);
    }
}
