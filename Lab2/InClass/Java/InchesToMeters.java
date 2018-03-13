import java.util.Scanner;
public class InchesToMeters{
    public static void main(String[] args){
        System.out.println("Input a value for inches: ");
        Scanner input = new Scanner(System.in);
        double inch = input.nextDouble();
        System.out.println(inch + " inches is " + inch * 0.0254 + " meters.");
    }
}