
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
       
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String name = "";
        String stdNo = "";
        while (true) {
            System.out.println("name: ");
            name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("studentnumber: ");
            stdNo = reader.nextLine();
            list.add(new Student(name, stdNo));
        }
        
        for (Student std : list) {
            System.out.println(std);
        }
        
        System.out.println("");
        System.out.println("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result; ");
        for (Student std : list) {
            if (std.getName().contains(search)) {
                System.out.println(std);
            }
        }
        
    }
}