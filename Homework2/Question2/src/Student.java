
public class Student {
    private String name;
    private Bag bag;
    private Cat cat;

    public Student(String name, Bag bag, Cat cat) {//Initialize student with name, bag and cat
        this.name = name;
        this.bag = bag;
        this.cat = cat;
    }

    public String getName() {//Get name of this student
        return name;
    }

    public Bag getBag() {//Get bag attributes of this student
        return bag;
    }

    public void setBag(Bag bag) {//Change the bag of this student
        this.bag = bag;
    }

    public String listPossessions() {//List all the possessions of this student
        return name + " has a " + cat.getDescr() +" and a " + bag.getDescr();
    }

    public void feedCat() {//Feed the cat of this student
        if (bag.getFood().getAmount() == 0)
            return;
        bag.getFood().addAmount(-1);
        cat.setWeight(cat.getWeight() + 1);
    }

    public static void testStudent() {
        Pen pen = new Pen("blue");
        Cat cat = new Cat("black", 10);
        Bag blackBag = new Bag("black", pen);
        Bag greenBag = new Bag("green", pen);
        Student stu = new Student("Bill", blackBag, cat);
        System.out.println(stu.getName().equals("Bill"));
        System.out.println(stu.getBag().equals(blackBag));
        stu.setBag(greenBag);
        System.out.println(stu.getBag().equals(greenBag));
        System.out.println(stu.listPossessions());
        stu.feedCat();
        System.out.println(stu.listPossessions());
        stu.feedCat();
        stu.feedCat();
        System.out.println(stu.listPossessions());
        stu.feedCat();
        System.out.println(stu.listPossessions());
    }
}