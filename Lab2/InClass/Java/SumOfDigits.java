import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, result = 0;
        while (true){
            System.out.print("Input an integer between 0 and 1000: ");
            num = input.nextInt();
            if (num >= 0 && num <= 1000)
                break;
            System.out.println("The number should be between 0 and 100!");
        }
        int save = num;
        while (num > 0){
            result += num % 10;
            num /= 10;
        }
        System.out.println("The sum of all digits in " + save + " is " + result);
    }
}