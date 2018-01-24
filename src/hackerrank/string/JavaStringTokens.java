package hackerrank.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if (!scan.hasNext()) {
            System.out.println(0);
        } else {
            String s = scan.nextLine();
            String[] a = s.trim().split("[ !,?._'@]+");
            List<String> list = new ArrayList<>(Arrays.asList(a));
            System.out.println(list.size());

            for (String str : list) {
                System.out.println(str);
            }
        }


    }

}
