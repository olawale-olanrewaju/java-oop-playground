package objectOriented.hof;

import java.util.Arrays;
import java.util.List;

public class HofConsumer {

    public static void main(String[] args) {
        List<String> facts = Arrays.asList(
                "Today is Monday",
                "Today is Tuesday",
                "Today is Wednesday",
                "Today is Thursday"
        );

        facts.forEach(fact -> {           //Consumer takes a paramteer and produces a side effect (x) -> {code}
            System.out.println(fact);
        });
    }

}
