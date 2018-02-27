import java.util.*;
public class Task2{
    public double abs(double num){//Return the absolute value of a number
        return num < 0 ? -num : num;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//Create a scanner to scan data
        Task2 task = new Task2();//Create an Object of current class
        System.out.print("Enter a floating-point number: ");
        double number = scan.nextDouble();//Get the input number of the user
        scan.close();//Close the scanner
        System.out.printf("The absolute value of %f is %f\n", number, task.abs(number));
    }
}