package codingbat.warmup1;

public class WarmUp1 {

    public int diff21(int n) {
        int dif = 0;
        if (n <= 21) {
            dif = 21 - n;
        } else {
            dif = (n - 21) * 2;
        }
        return dif;

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        if (aSmile && !bSmile) {
            return false;
        }
        return false;

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday & !vacation) {
            return true;
        }
        if (weekday & !vacation) {
            return false;
        }
        if (!weekday & vacation) {
            return true;
        }
        return true;
    }

    public int sumDouble(int a, int b) {
        int sum = 0;
        if (a != b) {
            sum = a + b;
        }
        if (a == b) {
            sum = (a + b) * 2;
        }
        return sum;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        int sum = a + b;
        if (a == 10|| b == 10 || sum == 10){
            return true;
        }
        Math.pow(2,7);

        return false;
    }

    public boolean nearHundred(int n) {
        if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
            return true;
        }
        return false;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }

    }

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        } else {
            return ("not " + str);
        }
    }

    public String missingChar(String str, int n) {
        String a = str.substring(0, n);
        String b = str.substring(n + 1, str.length());
        return a + b;
    }

    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            String mid = str.substring(1, str.length() - 1);
            return str.charAt(str.length() - 1) + mid + str.charAt(0);
        }
    }

    public String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        } else {
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        }
    }

    public String backAround(String str) {
        String back = str.substring(str.length() - 1);
        return back + str + back;
    }

    public boolean or35(int n) {
        if (n % 15 == 0) {
            return true;
        } else if (n % 3 == 0) {
            return true;
        } else if (n % 5 == 0) {
            return true;
        } else return false;
    }

    public String front22(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
    }

    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        } else if (str.substring(0, 2).equals("hi")) {
            return true;
        }
        return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 || temp2 < 0) && (temp1 > 100 || temp2 > 100)) {
            return true;
        } else return false;
    }

    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
    }

    public boolean loneTeen(int a, int b) {

        return ((a >= 13 && a <= 19) && !(b >= 13 && b <= 19) || !(a >= 13 && a <= 19) && (b >= 13 && b <= 19));
    }

    public String delDel(String str) {
        String a = str.substring(0, 1);
        String b = str.substring(1, 4);
        if (str.length() >= 4 && b.equals("del")) {
            return a + str.substring(4);
        }
        return str;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.substring(1, 3).equals("ix")) {
            return true;
        } else return false;
    }

    public String startOz(String str) {
        String res = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            res = res + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            res = res + str.charAt(1);
        }
        return res;
    }

    public int intMax(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else if (c > a && c > b) {
            max = c;
        }
        return max;
    }

    public int close10(int a, int b) {

        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        }
        if (Math.abs(a - 10) > Math.abs(b - 10)) {
            return b;
        }
        return 0;
    }

    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50)) {
            return true;
        }
        return false;
    }

    public int max1020(int a, int b) {
        int max = 0;
        if (a > b && a >= 10 && a <= 20) {
            max = a;
            return max;
        } else if (a < b && b >= 10 && b <= 20) {
            max = b;
            return max;
        }
        return 0;
    }

    public boolean stringE(String str) {
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') c++;
        }

        return (c >= 1 && c <= 3);
    }

    public boolean lastDigit(int a, int b) {
        if (((b % 10) == a) || ((a % 10) == b)) {
            return true;
        }
        return false;

    }

    public String endUp(String str) {
        if (str.length() < 3){
            return str.toUpperCase();
        }
        String back = str.substring(str.length() - 3);
        String front = str.substring(0, str.length() - 3);
        return front + back.toUpperCase();

    }
    public String everyNth(String str, int n) {
        String res = "";
        for (int i = 0; i < str.length(); i= i +n){
            res = res + str.charAt(i);
        }
        return res;
    }
}
