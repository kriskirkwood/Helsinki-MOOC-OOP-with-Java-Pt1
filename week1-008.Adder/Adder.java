
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type a number: ");
        int y = Integer.parseInt(reader.nextLine());
        
        int result = x + y;
        
        System.out.print("Sum of the numbers: " + result);

        // Implement your program here. Remember to ask the input from user
    }
}
