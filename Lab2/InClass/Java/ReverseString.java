import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inStr = input.next();
        System.out.printf("The reverse of the string \"%s\" is \"", inStr);
        for (int i = inStr.length() - 1; i >= 0; i--){
            System.out.print(inStr.charAt(i));
        }
        System.out.println("\"");
    }
}