
public class Bag {
    private String color;
    private Pen pen;
    public Bag(String color, Pen pen){//Initialize bag with color and pen
        this.color = color;
        this.pen = pen;
    }

    public String getColor() {//Get the color of bag
        return color;
    }

    public Pen getPen() {//Get the attributes of pen
        return pen;
    }

    public String getDescr(){//Get description of this bag
        return color + " bag containing a " + pen.getDescr();
    }

    public static void testBag(){
        Pen pen = new Pen("purple");
        Bag bag = new Bag("blue", pen);
        System.out.println(bag.getPen().equals(pen));
        System.out.println(bag.getColor().equals("blue"));
        System.out.println(bag.getDescr().equals("blue bag containing a purple pen"));
    }
}