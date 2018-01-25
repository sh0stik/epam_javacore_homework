package hackerrank.dataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int first = sc.nextInt();
        arr[0] = first;
        int count = first < 0 ? 1 : 0;

        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = arr[i - 1] + num;

            if (arr[i] < 0) {
                count++;
            }

            for (int j = 0; j < i; j++) {
                int subResult = arr[i] - arr[j];
                if (subResult < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
