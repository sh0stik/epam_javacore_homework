package hackerrank.objectOrientedProgramming;

import java.util.Scanner;

public class JavaInterface {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(myCalculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(myCalculator.divisorSum(n) + "\n");
        sc.close();
    }

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        return recSum(n,1);
    }

    private static int recSum(int n, int i) {
        int sum = 0;
        if (i > n){
            return sum;
        }
        if (n % i == 0) {
            sum += i;
        }
        return sum + recSum(n,++i);
    }
}

