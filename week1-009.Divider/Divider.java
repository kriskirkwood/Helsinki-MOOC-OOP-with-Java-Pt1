
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type a number: ");
        int y = Integer.parseInt(reader.nextLine());
        
        System.out.print("");
        System.out.print("Division: " + x + " / " + y + " = " + ((double)x/y));

        // Implement your program here. Remember to ask the input from user.
    }
}
