import java.util.*;
public class Task4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//Create a scanner to scan data
        int times;//The amount of numbers which will be input
        double number, result = 1.0;
        System.out.print("How many floating point numbers do you want to multiply together: ");
        times = scan.nextInt();
        for (int i = 0; i < times; i++){
            System.out.print("Enter a floating point number: ");
            number = scan.nextDouble();
            result *= number;
        }
        scan.close();//Close the scanner
        System.out.printf("The product is %f\n", result);
    }
}