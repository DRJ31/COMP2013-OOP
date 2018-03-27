
public class Student {
    private String name;
    private Bag bag;
    public Student(String name, Bag bag){//Initialize student with name and bag
        this.name = name;
        this.bag = bag;
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

    public String listPossessions(){//List all the possessions of this student
        return name + " has a " + bag.getDescr();
    }

    public static void testStudent(){
        Pen pen = new Pen("blue");
        Bag blackBag = new Bag("black", pen);
        Bag greenBag = new Bag("green", pen);
        Student stu = new Student("Bill", blackBag);
        //Testing get information functions
        System.out.println(stu.getName().equals("Bill"));
        System.out.println(stu.getBag().equals(blackBag));
        //Testing setBag function
        stu.setBag(greenBag);
        System.out.println(stu.getBag().equals(greenBag));
        System.out.println(stu.listPossessions());
    }
}
