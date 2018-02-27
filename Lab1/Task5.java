import java.util.*;
public class Task5{
    void array_abs(double[] arr){//Get the absolute value of every element in the array
        for (int i = 0; i < 5; i++){
            if (arr[i] < 0)
                arr[i] = -arr[i];
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//Create a scanner to scan data
        Task5 task = new Task5();//Create an object of this class
        double[] arr = new double[5];//Create a new array
        for (int i = 0; i < 5; i++){
            System.out.print("Enter a floating point number: ");
            arr[i] = scan.nextDouble();
        }
        task.array_abs(arr);
        System.out.print("The result is: ");
        for (double num : arr){//Print out absolute value of every elements in array
            System.out.print(num + " ");
        }
        System.out.println();
    }
}