
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account krisAccount = new Account("Kris's Account", 100.00);
        
        krisAccount.deposit(20);
        System.out.println(krisAccount);
    }

}
