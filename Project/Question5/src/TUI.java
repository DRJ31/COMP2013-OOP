import java.util.InputMismatchException;
import java.util.Scanner;

public class TUI {
    private static String readLine(String s) {
        System.out.print(s);
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        return str;
    }

    private static int readPosInt(String s) {
        System.out.print(s);
        Scanner input = new Scanner(System.in);
        int num;
        try {
            num = input.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("You muse type an integer!");
            num = readPosInt(s);
        }
        while (num < 0) {
            System.out.println("Positive integers only!");
            num = readPosInt(s);
        }
        input.nextLine();
        return num;
    }

    public static void main(String[] args) {
        String str1 = readLine("Type some text: ");
        System.out.println("Text read is: " + str1);
        int i = readPosInt("Type an integer: ");
        System.out.println("Integer read is: " + i);
        String str2 = readLine("Type some text again: ");
        System.out.println("Text read is: " + str2);
    }
}
