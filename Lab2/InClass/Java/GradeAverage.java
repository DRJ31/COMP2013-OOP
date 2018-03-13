import java.util.Scanner;
public class GradeAverage{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[] grades = new int[numStudents];
        int index = 0;
        int sum = 0;
        while (index < numStudents){
            System.out.print("Enter grade for student " + (index + 1) + ": ");
            grades[index] = input.nextInt();
            if (grades[index] >= 0 && grades[index] <= 100){
                sum += grades[index];
                index++;
                continue;
            }
            System.out.println("Invalid grade, try again...");
        }
        System.out.println("The average is: " + (sum * 1.0 / numStudents));
    }
}