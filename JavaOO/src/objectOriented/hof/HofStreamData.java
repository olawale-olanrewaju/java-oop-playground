package objectOriented.hof;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class HofStreamData {

    public static void main(String[] args) {

        // Creating stream from datasource: Array
//        String[] greetings = new String[]{"Hello!", "Holla!", "Bonjour!", "Hallo!"};
//
//        Arrays.stream(greetings)
//                .filter(greeting -> greeting.startsWith("H"))
//                .map(greeting -> greeting.toUpperCase())
//                .forEach(greeting -> System.out.println(greeting));

        // Creating stream from datasource: File
        try {
            Path path = Paths.get("/Users/olawaleolanrewaju/Documents/Git/JavaDeveloper/JavaOO/src/objectOriented/hof/greetings.txt");
//            Path path = Path.of("/Users/olawaleolanrewaju/Documents/Git/JavaDeveloper/JavaOO/src/objectOriented/hof/greetings.txt");

//            List<String> greetings = Files.lines(path).toList();
//            System.out.println(greetings);

            Files.lines(path)
                    .filter(line -> line.startsWith("S"))
                    .forEach(line -> System.out.println(line));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
