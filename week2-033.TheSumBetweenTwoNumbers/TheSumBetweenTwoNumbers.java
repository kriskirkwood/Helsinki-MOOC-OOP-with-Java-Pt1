
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int y = Integer.parseInt(reader.nextLine());
        int sum = 0;
        
        while (x <= y) {
            sum += x;
            
            x ++;
        }
        System.out.println("Sum = " + sum);
        
    }
}
