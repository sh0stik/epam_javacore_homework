package hackerrank.introducktion;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int i = 0;

        while(scan.hasNext()){
            i++;
            System.out.println(i + " " + scan.nextLine());
        }
    }
}
