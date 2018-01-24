package codingbat.logic;

public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        int max = goal / 5;
        if (max <= big) {
            goal -= max * 5;
        } else goal -= big * 5;

        return goal <= small;
    }

    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }
        return sum;
    }

    public int luckySum(int a, int b, int c) {
        int sum = 0;

        if (a != 13 && b != 13 && c != 13) {
            sum = a + b + c;
        }
        if (a != 13 && b == 13) {
            sum = a;
        }
        if (a != 13 && b != 13 && c == 13) {
            sum = a + b;
        }
        return sum;

    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeenSum(a) + fixTeenSum(b) + fixTeenSum(c);

    }

    public int fixTeenSum(int n) {
        if (n <= 19 && n >= 13 && n != 15 && n != 16)
            return 0;
        return n;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int n) {
        if (n % 10 >= 5) return (n - n % 10 + 10);
        else return (n - n % 10);
    }

    public boolean closeFar(int a, int b, int c) {
        return ((Math.abs(b - a) <= 1 && Math.abs(b - c) >= 2 && Math.abs(c - a) >= 2) ||
                (Math.abs(a - c) <= 1 && Math.abs(b - c) >= 2 && Math.abs(b - a) >= 2));
    }

    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) return 0;
        if ((a <= 21 && (21 - a) < (21 - b)) || (a <= 21 && b > 21)) return a;
        else return b;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int n;
        if (b > a) {
            n = a;
            a = b;
            b = n;
        }
        if (c > b) {
            n = b;
            b = c;
            c = n;
        }
        if (b > a) {
            n = a;
            a = b;
            b = n;
        }
        return (a - b == b - c);
    }

    public int makeChocolate(int small, int big, int goal) {
        int maxBig = goal / 5;
        if (maxBig <= big){
            goal -= maxBig * 5;
        }
        else{
            goal -= big * 5;
        }
        if (goal <= small){
            return goal;
        }
        return -1;
    }


}
