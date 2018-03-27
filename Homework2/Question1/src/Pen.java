
public class Pen {
    private String color;
    public Pen(String color){//Initialize pen with color
        this.color = color;
    }

    public String getDescr(){//Get description of pen
        return color + " pen";
    }

    public static void testPen(){
        Pen pen = new Pen("purple");
        System.out.println(pen.getDescr().equals("purple pen"));
    }
}