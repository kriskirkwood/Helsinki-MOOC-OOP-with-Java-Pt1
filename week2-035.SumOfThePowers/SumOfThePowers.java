
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        
        
        int sum = 1;
        
        while (x != 0) {
            int result = (int)Math.pow(2,x);
            sum += result;
            x --;
             
        }
        System.out.println("The result is: " + sum);

    }
}
