public class SumAndAverage {
    private static void oddNumber(){
        int sum = 0;
        for (int i = 1; i < 100; i += 2){//Only add odd number to sum
            sum += i;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + (sum * 1.0 / 50));
        //Divided by 50 because there are 50 odd numbers in 1-100
    }
    private static void dividedBySeven(){
        //Number is the number which will be added if it can be divised by 7
        int sum = 0, amount = 0, number = 1;
        //Amount is the amount of numbers which can be divided by 7
        while (number <= 100){
            if (number % 7 == 0){
                sum += number;
                amount++;//Count number which can be divided by 7
            }
            number++;
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + (sum * 1.0 / amount));
    }
    private static void squareSum(){
        int sum = 0, num = 1;
        do{
            sum += num * num;
            num++;
        } while(num <= 100);
        System.out.println("The result is: " + sum);
    }

    public static void main(String[] args) {
        oddNumber();
        dividedBySeven();
        squareSum();
    }
}
