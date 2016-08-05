
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.println("Type the password: ");
            String passwordguess = reader.nextLine();
            
            if (password.equals(passwordguess)) {
                break;
            } else {
                System.out.println("Wrong!");
            }
            
        } 
        System.out.println("Right!");
        System.out.println("");
        System.out.println("The secret is: hello!");
    }
}
