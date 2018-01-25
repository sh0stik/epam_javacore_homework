package hackerrank.bigNumber;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null || o2 == null) {
                    return 0;
                }
                BigDecimal bd1 = new BigDecimal(o1);
                BigDecimal bd2 = new BigDecimal(o2);
                return bd2.compareTo(bd1);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
