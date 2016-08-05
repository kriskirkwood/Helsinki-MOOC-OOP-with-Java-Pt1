
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
               
        int n = 1;
        while ( n <= number ) {
            System.out.println(n);
              
            n++;
             
        }
        
    }
}
