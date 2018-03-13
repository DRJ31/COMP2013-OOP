public class TimeTable{
    public static void main(String[] args){
        //Print the first line of table
        System.out.print("* |");
        for (int i = 1; i < 10; i++){
            System.out.printf("\t%d", i);
        }
        System.out.println();
        //Print the line of table
        for (int i = 0; i < 39; i++)
            System.out.print("-");
        System.out.println();
        //Print data of table
        for (int i = 1; i <= 9; i++){
            System.out.print(i + " |");
            for (int j = 1; j <= 9; j++){
                System.out.print("\t" + (i * j));
            }
            System.out.println();
        }
    }    
}