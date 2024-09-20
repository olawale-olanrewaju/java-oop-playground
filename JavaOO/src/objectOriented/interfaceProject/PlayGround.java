package objectOriented.interfaceProject;

import objectOriented.interfaceProject.constants.Transaction;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlayGround {

    public static void main(String[] args) {


        //***************** ENUMS and SWITCH ***********************
        Transaction[] transactions = Transaction.values();

        Arrays.stream(transactions).forEach(transaction -> {
            System.out.println(transaction.toString());
        });

//        String mytransaction = transactions[0].toString();
        String mytransaction = Transaction.valueOf("WITHDRAWAL").toString();

        switch (mytransaction){
            case "WITHDRAWAL": System.out.println("This is a withdrawal \n"); break;
            case "DEPOSIT": System.out.println("This is a deposit \n"); break;
            default: System.out.println("There's no such type \n");
        }

        //******************** FILES and PATHS **********************

        Path[] paths = new Path[]{
                Path.of("/Users/olawaleolanrewaju/Documents/Git/JavaDeveloper/JavaOO/src/objectOriented/interfaceProject/data/transactions.txt"),
                Path.of("/Users/olawaleolanrewaju/Documents/Git/JavaDeveloper/JavaOO/src/objectOriented/interfaceProject/data/accounts.txt")
        };

        try{
            Files.lines(paths[0]).forEach(line -> {
//                System.out.println(line);
            });
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //************* FILEINPUTSTREAM **********************
        try {
            FileInputStream fis = new FileInputStream("/Users/olawaleolanrewaju/Documents/Git/JavaDeveloper/JavaOO/src/objectOriented/interfaceProject/data/accounts.txt");
            Scanner scan = new Scanner(fis);
            System.out.println(scan.nextLine());
            System.out.println(scan.nextLine());
            System.out.println(scan.nextLine());
            System.out.println(scan.nextLine());
            System.out.println(scan.nextLine());

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            FileReader fis = new FileReader("/Users/olawaleolanrewaju/Documents/Git/JavaDeveloper/JavaOO/src/objectOriented/interfaceProject/data/accounts.txt");
            Scanner scan = new Scanner(fis);
            System.out.println(scan.nextLine());
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}
