package codingbat.recursion;

public class Recursion1 {
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }


    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return bunnies;
        }
        if (bunnies % 2 == 1)
            return 2 + bunnyEars2(bunnies - 1);

        return 3 + bunnyEars2(bunnies - 1);
    }

    public int triangle(int rows) {
        if (rows <= 1) {
            return rows;
        }
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public int count7(int n) {
        if (n == 0)
            return 0;

        if (n % 10 == 7)
            return 1 + count7(n / 10);

        return count7(n / 10);
    }

    public int count8(int n) {
        if (n == 0)
            return 0;

        if (n % 10 == 8) {
            if ((n / 10) % 10 == 8)
                return 2 + count8(n / 10);

            return 1 + count8(n / 10);
        }

        return count8(n / 10);
    }

    public int powerN(int base, int n) {
        if (n == 1) {
            return base;
        }
        return base * powerN(base, n - 1);
    }

    public int countX(String str) {
        if (str.length() == 0)
            return 0;

        if (str.charAt(0) == 'x')
            return 1 + countX(str.substring(1));

        return countX(str.substring(1));
    }

    public int countHi(String str) {
        int count = 0;
        if (str.length() < 2) {
            return count;
        }
        if (str.substring(0, 2).equals("hi")) {
            count += 1;
        }
        return count + countHi(str.substring(1));
    }

    public String changeXY(String str) {
        if (str.length() < 1) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return 'y' + changeXY(str.substring(1));
        }

        return str.charAt(0) + changeXY(str.substring(1));
    }

    public String changePi(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2));
        }
        return str.substring(0, 1) + changePi(str.substring(1));
    }

    public String noX(String str) {
        if (str.length() < 1) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        }
        return str.charAt(0) + noX(str.substring(1));
    }

    public boolean array6(int[] nums, int index) {
        return index < nums.length && (nums[index] == 6 || array6(nums, ++index));
    }

    public int array11(int[] nums, int index) {
        int count = 0;
        if (index >= nums.length) {
            return count;
        }
        if (nums[index] == 11) {
            count++;
        }
        return count + array11(nums, ++index);
    }

    public boolean array220(int[] nums, int index) {
        return index < nums.length - 1 && (nums[index + 1] == nums[index] * 10 || array220(nums, ++index));
    }

    public String allStar(String str) {
        if (str.length() < 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return str.substring(str.length() - 1);
        }
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    public String pairStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }

    public String endX(String str) {
        if (str.length() < 1) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + str.charAt(0);
        }
        return str.charAt(0) + endX(str.substring(1));
    }

    public int countPairs(String str) {
        int count = 0;
        if (str.length() <= 2) {
            return count;
        }
        if (str.charAt(0) == str.charAt(2)) {
            count++;
        }
        return count + countPairs(str.substring(1));
    }

    public int countAbc(String str) {
        int count = 0;
        if (str.length() < 3) {
            return count;
        }
        if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
            count++;
        }
        return count + countAbc(str.substring(1));
    }

    public int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("11")) {
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }

    public String stringClean(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }

    public int countHi2(String str) {
        if (str.length() <= 1) {
            return 0;
        }
        if (str.length() > 2 && str.substring(0, 3).equals("xhi")) {
            return countHi2(str.substring(3));
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        return countHi2(str.substring(1));
    }

    public String parenBit(String str) {
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return str;
        }
        if (str.charAt(0) == '(') {
            return parenBit(str.substring(0, str.length() - 1));
        }
        if (str.charAt(str.length() - 1) == ')') {
            return parenBit(str.substring(1));
        }
        return parenBit(str.substring(1, str.length() - 1));
    }

    public boolean nestParen(String str) {
        return str.length() == 0 || str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')' && nestParen(str.substring(1, str.length() - 1));
    }

    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }

    public boolean strCopies(String str, String sub, int n) {
        if (n == 0) {
            return true;
        }
        if (str.length() < sub.length()) {
            return false;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return strCopies(str.substring(1), sub, --n);
        }
        return strCopies(str.substring(1), sub, n);
    }

    public int strDist(String str, String sub) {
        if (str.length() < sub.length()){
            return 0;
        }
        if (str.substring(0, sub.length()).equals(sub) &&
                str.substring(str.length() - sub.length()).equals(sub)) {
            return str.length();
        }
        if (!str.substring(0, sub.length()).equals(sub)){
            return strDist(str.substring(1), sub);
        }
        return strDist(str.substring(0, str.length() - 1), sub);
    }

}
