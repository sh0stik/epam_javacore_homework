package hackerrank.exceptionHandlingChallenges;

import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try {
                int res = x / y;
                System.out.println(res);
            } catch (Exception e) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
        } catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
