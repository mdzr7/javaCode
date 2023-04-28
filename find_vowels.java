package payilagam.homeWork;

import java.io.BufferedReader;
import java.io.FileReader;

public class find_vowels {
    public static void main(String[] args) {
        System.err.println("read a file and find which words have a vowels");
        try {
            FileReader reader = new FileReader("C:\\Users\\smszu\\OneDrive\\Desktop\\file writer\\new.txt");
            BufferedReader bfReader = new BufferedReader(reader);
            String words = bfReader.readLine();
            String[] a = words.split(" ");
            for (int times = 0; times <= a.length; times++) {
                if (a[times].contains("a")||a[times].contains("e")||a[times].contains("i")||a[times].contains("o")||a[times].contains("u")) {
                    System.out.println(a[times]);
                }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }


    }
}
