
public class Cat {
    private String color;
    private int weight;

    public Cat(String color, int weight) {//Initialize cat with color and weight
        this.color = color;
        this.weight = weight > 0 ? weight : 1;
    }

    public int getWeight() {//Get the weight of this cat
        return weight;
    }

    public boolean setWeight(int weight) {//Reset the weight of this cat
        if (weight <= 0)
            return false;
        this.weight = weight;
        return true;
    }

    public String getDescr() {//Get the description of cat
        return color + " cat weighing " + weight + " Kg";
    }

    public static void testCat() {
        Cat cat = new Cat("white", 6);
        System.out.println(cat.getWeight() == 6);
        System.out.println(cat.setWeight(-1) == false);
        System.out.println(cat.getWeight() == 6);
        System.out.println(cat.setWeight(10) == true);
        System.out.println(cat.getWeight() == 10);
        System.out.println(cat.getDescr());
    }
}