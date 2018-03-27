
public class Food {
    private String name;
    private int amount;

    public Food(String name, int amount) {//Initialize food with name and amount
        this.name = name;
        this.amount = amount > 0 ? amount : 5;
    }

    public int getAmount() {//Get the amount of food
        return amount;
    }

    public void addAmount(int amount){//Add the amount of food
        this.amount = this.amount + amount >= 0 ? this.amount + amount : 0;
    }

    public String getName() {//Get the name of food
        return name;
    }

    public static void testFood(){
        Food fish = new Food("fish", 4);
        System.out.println(fish.getAmount() == 4);
        fish.addAmount(-5);
        System.out.println(fish.getAmount() == 0);
        fish.addAmount(3);
        System.out.println(fish.getAmount() == 3);
        System.out.println(fish.getName().equals("fish"));
    }
}
