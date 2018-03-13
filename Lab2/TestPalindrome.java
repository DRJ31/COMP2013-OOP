import java.util.Scanner;

public class TestPalindrome {
    private static String toCharArr(String str){//Put all the English letters into a new String
        StringBuilder temp = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len; i++){
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){//Check if the character is an English letter
                temp.append(str.charAt(i));
            }
        }
        return temp.toString();//Convert StringBuilder to String
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = input.nextLine();
        String newStr = toCharArr(str.toLowerCase());//Convert sentence into String with only English letters
        int len = newStr.length();
        for (int i = 0; i < len; i++){//Check if the String is a palindrome
            if (newStr.charAt(i) != newStr.charAt(len - 1 - i)){
                System.out.printf("\"%s\" is not a palindrome.\n", str);
                return;
            }
        }
        System.out.printf("\"%s\" is a palindrome.\n", str);
    }
}
