package hackerrank.introduction;

import java.util.*;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s=0;
            s = a + s;
            for (int j = 0; j < n; j++){

                //  Double d = new Double(j);
                s = s +(int)Math.pow(2, j) * b;
                System.out.print(s + " ");
            }
            System.out.println();}
        in.close();
    }
}
