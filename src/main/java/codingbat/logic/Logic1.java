package codingbat.logic;

public class Logic1 {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        return ((cigars <= 60 && cigars >= 40) || (isWeekend && cigars >= 40));

    }

    public int dateFashion(int you, int date) {
        if ((you >= 8 && date > 2) || (you > 2 && date >= 8)) return 2;
        else if (you <= 2 || date <= 2) return 0;
        else return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        return temp >= 60 && temp <= 100 && isSummer || temp >= 60 && temp <= 90;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (speed <= 60 || (speed <= 65 && isBirthday)) return 0;
        else if (speed <= 80 || speed <= 85 && isBirthday) return 1;
        else return 2;
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) return 20;
        else return sum;
    }

    public String alarmClock(int day, boolean vacation) {
        if ((day == 0 || day == 6) && vacation) return "off";
        else if (day == 0 || day == 6 || (day >= 1 && day < 6 && vacation)) return "10:00";
        else return "7:00";

    }

    public boolean love6(int a, int b) {
        return ((a == 6 || b == 6) || Math.abs(a - b) == 6 || a + b == 6);
    }

    public boolean in1To10(int n, boolean outsideMode) {
        return ((n >= 1 && n <= 10 && !outsideMode) || ((n <= 1 || n >= 10) && outsideMode));
    }

    public boolean specialEleven(int n) {
        return ((n % 11 == 0) || (n - 1) % 11 == 0);
    }

    public boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }

    public boolean old35(int n) {
        return n % 15 != 0 && (n % 3 == 0 || n % 5 == 0);
    }

    public boolean less20(int n) {
        return ((n + 1) % 20 == 0 || (n + 2) % 20 == 0);
    }

    public boolean nearTen(int num) {
        return ((num + 2) % 10 == 0 || (num + 1) % 10 == 0 || (num - 1) % 10 == 0 || (num - 2) % 10 == 0 || num % 10 == 0);
    }

    public int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) return 19;
        else return a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (!isMorning || !isMom);
    }

    public int teaParty(int tea, int candy) {
        int res = 0;
        if (tea >= 5 && candy >= 5) res = 1;
        if (tea < 5 || candy < 5) res = 0;
        else if (tea / candy >= 2 || candy / tea >= 2) res = 2;
        return res;
    }

    public String fizzString(String str) {
        if (str.substring(0, 1).equals("f") && str.substring(str.length() - 1).equals("b")) return "FizzBuzz";
        else if (str.substring(0, 1).equals("f")) return "Fizz";
        else if (str.substring(str.length() - 1).equals("b")) return "Buzz";
        else return str;
    }

    public String fizzString2(int n) {
        if (n % 15 == 0) return "FizzBuzz";
        else if (n % 3 == 0) return "Fizz";
        else if (n % 5 == 0) return "Buzz";
        return "" + n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        int sum12 = a + b;
        int sum23 = b + c;
        int sum13 = a + c;
        return (sum12 == c || sum23 == a || sum13 == b);
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return b > a && c > b || bOk && c > b;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return a < b && b < c || (equalOk && ((a == b && b < c) || (b == c && a < b) || (a == b && b == c)));
    }

    public boolean lastDigit(int a, int b, int c) {
        return ((a % 10 == b % 10 && b % 10 == c % 10) || (a % 10 == b % 10) || (b % 10 == c % 10) || (a % 10 == c % 10));
    }

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (die1 == die2 && die1 + die2 == 12 && noDoubles) return die2 + 1;
        if (die1 == die2 && noDoubles) return die1 + die2 + 1;
        else return die1 + die2;
    }

    public int maxMod5(int a, int b) {
        int max;
        if (a == b) return 0;
        if (a % 5 == b % 5 && a < b) return a;
        else if (a % 5 == b % 5 && a > b) return b;
        if (a > b) max = a;
        else max = b;
        return max;
    }

    public int redTicket(int a, int b, int c) {
        if (a != b && a != c) return 1;
        if (a == 2 && b == 2 && c == 2) return 10;
        else if (a == b && b == c) return 5;
        else return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b != c || a != b && b == c || a != b && a == c) return 10;
        if (a != b) return 0;
        else return 20;
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10)
            return 10;

        if (ab == bc + 10 || ab == ac + 10)
            return 5;
        return 0;
    }

    public boolean shareDigit(int a, int b) {
        return (a / 10 == b / 10 || a % 10 == b % 10 ||
                a % 10 == b / 10 || a / 10 == b % 10);
    }

    public int sumLimit(int a, int b) {
        String str1 = String.valueOf(a);
        int n = str1.length();
        String str2 = String.valueOf(a + b);
        int n1 = str2.length();

        if (n1 > n) return a;
        return a + b;
    }

}

