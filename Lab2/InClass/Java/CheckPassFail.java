import java.util.Scanner;
public class CheckPassFail{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = input.nextInt();
        if (score >= 50)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        System.out.println("DONE");
    }
}