import java.util.*;
public class Task3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//Create a new scanner to scan data
        System.out.print("Enter the start integer: ");
        int start = scan.nextInt();//Get the first integer
        System.out.print("Enter the end integer: ");
        int end = scan.nextInt();//Get the second integer
        scan.close();//Close the scanner
        for (int i = start; i <= end; i++){
            System.out.print(i + " ");//Print out the numbers
        }
        System.out.println();//Line break
    }
}