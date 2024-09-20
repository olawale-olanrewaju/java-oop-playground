package objectOriented;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            read("/Users/olawaleolanrewaju/Documents/Git/JavaDeveloper/JavaOO/src/objectOriented/greetings.txt");
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Process complete");
        }
    }

    public static void read(String filename) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(filename);
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}
