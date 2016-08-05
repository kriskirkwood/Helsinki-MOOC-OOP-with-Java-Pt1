
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        
        int n = 1;
        while ( n <= number ) {
            //System.out.println( n );
             sum = sum + n; //sum+=n;
              
             n++;
             
        }
        System.out.println("sum is: " + sum);

    }
}
