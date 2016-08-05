import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random;
    
    

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
        
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        while (i <= this.length -1) {
            
            password = password + alphabet.charAt(this.random.nextInt(26));
            i++;
            
        }
        return password;
    }
}
