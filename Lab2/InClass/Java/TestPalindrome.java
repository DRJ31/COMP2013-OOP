import java.util.Scanner;
public class TestPalindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inStr = input.next();
        char[] arr = inStr.toLowerCase().toCharArray();
        int len = inStr.length();
        for (int i = 0; i < len / 2; i++){
            if (arr[i] != arr[len - 1 - i]){
                System.out.printf("\"%s\" is not a Palindrome.\n", inStr);
                return;
            }
        }
        System.out.printf("\"%s\" is a Palindrome.\n", inStr);
    }
}