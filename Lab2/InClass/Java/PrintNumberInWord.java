import java.util.Scanner;
public class PrintNumberInWord{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        String[] numbers = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        if (number > 0 && number <= 9)
            System.out.println(numbers[number - 1]);
        else
            System.out.println("OTHER");
        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(numbers[number - 1]);
                break;
            default:
                System.out.println("OTHER");
        }
    }
}