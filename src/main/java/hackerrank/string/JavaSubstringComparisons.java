package hackerrank.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubstringComparisons {


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> list = new ArrayList<String>();

        for (int i = 0; i <= (s.length() - k); i++) {
            list.add(s.substring(i, k + i));
        }
        Collections.sort(list);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = list.get(0);
        largest = list.get(list.size() - 1);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

