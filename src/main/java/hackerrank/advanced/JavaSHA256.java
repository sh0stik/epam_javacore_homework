package hackerrank.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        MessageDigest d = MessageDigest.getInstance("SHA-256");
        d.reset();
        d.update(in.nextLine().getBytes());
        for (byte i : d.digest()) {
            System.out.print(String.format("%02x", i));
        }
        System.out.println();
    }
}
