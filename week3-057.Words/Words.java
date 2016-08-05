import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        
        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
        
            words.add(word);
            
            if (word.isEmpty()) {
                System.out.println("You typed the following words: ");
                for (String list : words) {
                System.out.println(list);
                }
                break;
            }
        } 
        
    }
}
