import java.util.*;
public class Task6{
    final static int MONTHS = 12;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//Create a scanner to scan data
        //Array to store how many days in every month
        int day_in_month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month, days, result = 0;
        while(true){//Input and check if the value of month is valid
            System.out.print("Enter the month: ");
            month = scan.nextInt();
            if (month > 0 && month < 13)
                break;
        }
        while(true){//Input and check if the value of day is valid
            System.out.print("Enter the day: ");
            days = scan.nextInt();
            if (days > 0 && days <= day_in_month[month-1])
                break;
        }
        scan.close();//Close the scanner
        for (int i = 0; i < month - 1; i++){
            result += day_in_month[i];
        }
        result += days;
        System.out.printf("%d/%d is the day number %d in the year.\n", days, month, result);
    }
}