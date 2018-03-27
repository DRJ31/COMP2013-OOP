
/*
* Check is better to be static because we can use it without initialize in class Start if it is static
*/

public class Start {
    public static String check(Chicken chicken){
        return chicken.isSleeping() ? "sweet dreams" : "need coffee";
    }
    public static void main(String[] args) {
        Chicken.testChicken();
        Chicken c = new Chicken(2.3);
        System.out.println(check(c));
    }
}
