public class SumAndAverage {
    private static void oddNumber(){
        int sum = 0; // Store the accumulated sum init to 0double average; // average in double
		int lowerbound = 1; // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum
		for(int number = lowerbound; number <= upperbound; number += 2) {
			sum += number; // same as "sum = sum + number"
		}
		// Compute average in double. Beware that int/int produces int.
		double average = (double) sum / ((upperbound - lowerbound + 1) / 2);
		// Print sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
    }
    private static void dividedBySeven(){
        int sum = 0; // Store the accumulated sum init to 0double average; // average in double
		int lowerbound = 1; // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum
		int number = lowerbound;
		int count = 0;//Count the numbers of number which can be divided by 7
		while(number <= upperbound) {
			if (number % 7 == 0) {
				sum += number;
				count++;
			}
			number++;
		}
		double average = (double) sum / count;
		// Print sum and average
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
    }
    private static void squareSum(){
        int sum = 0; // Store the accumulated sum init to 0double average; // average in double
		int lowerbound = 1; // The lowerbound to sum
		int upperbound = 100; // The upperbound to sum
		int number = lowerbound;
		do {
			sum += number * number;
			number++;
		} while(number <= upperbound);
		// Print sum and average
		System.out.println("The sum is " + sum);
    }

    public static void main(String[] args) {
        oddNumber();
        dividedBySeven();
        squareSum();
    }
}
