import java.util.Scanner;

public class TestPalindrome {
    public static String toOnlyLetterString(String s) {//Convert a sentence into string with only English letters
		StringBuilder str = new StringBuilder();//A StringBuilder to save the new string
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				str.append(s.charAt(i));//Add English letter into StringBuilder
			}
		}
		return str.toString();
	}
	public static void main(String[] args) {
		System.out.print("Enter a String: ");
		Scanner in = new Scanner(System.in);
		String inStr = in.nextLine(); // read string
		String lowStr = toOnlyLetterString(inStr.toLowerCase()); // convert to lowercase
		int fIdx = 0, bIdx = lowStr.length() - 1; // forward & backward indexes
		char fChar, bChar; // forward & backward characters
		while(fIdx < bIdx) {
			fChar = lowStr.charAt(fIdx);
			bChar = lowStr.charAt(bIdx);
			if(fChar != bChar) {
				System.out.println("\"" + inStr + "\" is not a palindrome");
				return;
			} else { // match, change index
				fIdx++;
				bIdx--;
			}
		}
		System.out.println("\"" + inStr + "\" is a palindrome");
    }
}
