package hackerrank.dataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java2DArray {
    public static void main(String[] args) {
        int arr[][] = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    arr[i][j] = scanner.nextInt();
                    if (i > 1 && j > 1) {
                        int sum =
                                arr[i][j]
                                        + arr[i][j - 1]
                                        + arr[i][j - 2]
                                        + arr[i - 1][j - 1]
                                        + arr[i - 2][j]
                                        + arr[i - 2][j - 1]
                                        + arr[i - 2][j - 2];
                        if (sum > maxSum) {
                            maxSum = sum;
                        }
                    }
                }
            }

        }
        System.out.println(maxSum);
    }
}
