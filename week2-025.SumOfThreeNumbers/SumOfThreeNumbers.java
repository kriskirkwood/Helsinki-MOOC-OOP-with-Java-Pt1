
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        // store numbers read form user in this variable


        // Write your program here
        // Use only variables sum and read
        System.out.println("Type the first number: ");
        int read = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        read = read + Integer.parseInt(reader.nextLine());
        System.out.println("Enter the third number: ");
        read = read + Integer.parseInt(reader.nextLine());
                
        sum = sum + read;
        

        System.out.println("Sum: " + sum);
    }
}
