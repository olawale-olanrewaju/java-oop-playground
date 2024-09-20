package beginning;

public class Immutable {

    public static void main(String[] args) {

        int aNumber = 5;
        Integer number = null;
        number = 5;

        String text = "Hi";
        String atext = text.toLowerCase();
//        String text = new String("Hi");

        System.out.println(text.toLowerCase());
    }
}