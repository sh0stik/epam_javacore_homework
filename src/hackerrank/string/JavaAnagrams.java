package hackerrank.string;
import java.io.*;
import java.util.*;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        int [] temp = new int [Character.MAX_VALUE];

        int sum = 0;

        for (int i = 0; i < a.length(); i++){
            sum += ++temp [a.charAt(i)] <= 0 ? -1 : 1;
            sum += --temp [b.charAt(i)] >= 0 ? -1 : 1;
        }

        return sum == 0;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
