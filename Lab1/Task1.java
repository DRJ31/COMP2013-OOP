import java.util.*;
public class task1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//Create a new scanner to scan data
        System.out.print("Enter the first number: ");
        int first = scan.nextInt();//Scan the first number
        System.out.print("Enter the second number: ");
        int second = scan.nextInt();//Scan the second number
        scan.close();//Close the scanner
        if (first >= 0 && second >= 0)
            System.out.printf("The integer %d and %d are both positive.\n", first, second);
        else
            System.out.printf("The integer %d and %d are not both positive.\n", first, second);
    }
}