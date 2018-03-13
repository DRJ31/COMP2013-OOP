import java.util.Scanner;
public class SumAndAverage{
    public static void main(String[] args){
        int sum = 0;
        for (int i = 0; i <= 100; i++){
            sum += i;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum * 1.0 / 100);
    }
}