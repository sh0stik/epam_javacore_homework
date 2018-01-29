package hackerrank.dataStructures;
/*Java's BitSet class implements a vector of bit values (i.e.:  () or  ()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of  is called a set bit.
Given  BitSets,  and , of size  where all bits in both BitSets are initialized to , perform a series of operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
Input Format
The first line contains  space-separated integers,  (the length of both BitSets  and ) and  (the number of operations to perform), respectively.
The  subsequent lines each contain an operation in one of the following forms:
AND
OR
XOR
FLIP
SET
In the list above,  is the integer  or , where  denotes  and  denotes .
 is an integer denoting a bit's index in the BitSet corresponding to .
For the binary operations , , and , operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:
AND 2 1
 is the left operand, and  is the right operand. This operation should assign the result of  to .
Constraints
Output Format
After each operation, print the respective number of set bits in BitSet  and BitSet  as  space-separated integers on a new line.
Sample Input
5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1
Sample Output
0 0
1 0
1 1
1 2*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        BitSet bs1 = new BitSet(m);
        BitSet bs2 = new BitSet(n);

        for (int i = 0; i < n; i++) {
            String op = sc.next();
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            if (op.equals("AND") || op.equals("OR") || op.equals("XOR")) {
                if (s1 == 1) {
                    switch (op) {
                        case "AND":
                            bs1.and(bs2);
                        case "OR":
                            bs1.or(bs2);
                        case "XOR":
                            bs1.xor(bs2);
                            break;
                    }
                } else {
                    switch (op) {
                        case "AND":
                            bs2.and(bs1);
                            break;
                        case "OR":
                            bs2.or(bs1);
                            break;
                        case "XOR":
                            bs2.xor(bs1);
                            break;
                    }
                }
            }
            if (op.equals("SET") || op.equals("FLIP")) {
                if (s1 == 1) {
                    switch (op) {
                        case "SET":
                            bs1.set(s2);
                        case "FLIP":
                            bs1.flip(s2);
                            break;
                    }
                } else {
                    switch (op) {
                        case "SET":
                            bs2.set(s2);
                        case "FLIP":
                            bs2.flip(s2);
                            break;
                    }
                }
            }
            System.out.println(bs1.cardinality() + " " + bs2.cardinality());

        }

    }
}
