package codingbat.string1;

public class String1 {

    public String helloName(String name) {
        String hello = "Hello";
        return hello + " " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        if (str.length() < 3) {
            return str + str + str;
        } else
            return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
    }

    public String firstTwo(String str) {
        if (str.length() < 3) {
            return str;
        } else return str.substring(0, 2);

    }

    public String firstHalf(String str) {
        int half = str.length() / 2;
        if (str.length() < 2) {
            return str;
        } else return str.substring(0, half);

    }

    public String withoutEnd(String str) {
        if (str.length() <= 2) {
            return "";
        } else return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() == 0 && b.length() == 0) return "";
        String small = "";
        String big = "";

        if (a.length() < b.length()) {
            small = small + a;
            big = big + b;
        } else {
            small = small + b;
            big = big + a;
        }

        return small + big + small;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        if (str.length() < 3) return str;
        return str.substring(2, str.length()) + str.substring(0, 2);
    }

    public String right2(String str) {
        if (str.length() < 3) return str;
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else return str.substring(str.length() - 1);
    }

    public String withouEnd2(String str) {
        if (str.length() < 3) return "";
        return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        int half = str.length() / 2;
        return str.substring(half - 1, half + 1);
    }

    public boolean endsLy(String str) {
        if (str.length() < 2) return false;
        if (str.substring(str.length() - 2).equals("ly")) return true;
        return false;
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if ((index > str.length() - 2) || index < 0) return str.substring(0, 2);

        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        if (str.length() == 3) return str;
        int middle = str.length() / 2;
        if (str.length() % 2 == 0) {
            return str.substring(middle - 1, middle + 1);
        }
        return str.substring(middle - 1, middle + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() == 3 && str.equals("bad")) return true;
        if (str.length() < 3 || (str.substring(1).length() < 3 && !(str.substring(1).equals("bad")))) return false;
        if ((str.substring(0, 3).equals("bad") || (str.substring(1, 4).equals("bad")))) {
            return true;
        }
        return false;
    }

    public String atFirst(String str) {
        if (str.length() < 1) return "@@";
        if (str.length() < 2) return str + "@";
        return str.substring(0, 2);

    }

    public String lastChars(String a, String b) {
        if (a.length() < 1 && b.length() < 1) return "@@";
        if (a.length() < 1) return "@" + b.substring(b.length() - 1);
        if (b.length() < 1) return a.substring(0, 1) + "@";
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) return a + b;
        if (a.charAt(a.length() - 1) == b.charAt(0)) return (b.length() != 1) ? a + b.substring(1, b.length()) : a;
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() == 0) return "";
        if (str.length() < 3) return str.substring(1) + str.substring(0, 1);
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

    public String seeColor(String str) {

        if (str.length() >= 3 && str.substring(0, 3).equals("red")) return str.substring(0, 3);
        if (str.length() >= 4 && str.substring(0, 4).equals("blue")) return str.substring(0, 4);
        else return "";
    }

    public boolean frontAgain(String str) {
        if (str.length() <= 1) return false;
        if (str.length() < 4 && str.length() > 1) return true;
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) return true;
        return false;
    }

    public String minCat(String a, String b) {
        if (a.length() > b.length()) return a.substring(a.length() - b.length()) + b;
        else return a + b.substring(b.length() - a.length());
    }

    public String extraFront(String str) {
        if (str.length() == 0) return "";
        if (str.length() <= 2) return str + str + str;
        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }

    public String without2(String str) {
        if (str.length() < 1) return "";
        if (str.length() == 1) return str;
        if ( str.substring(0,2).equals(str.substring(str.length()-2))) return str.substring(2);
        return str;
    }

    

    public static void main(String[] args) {
        String1 par = new String1();
        //  System.out.println( par.twoChar("Hello", 3));
        System.out.println(par.hasBad("xba"));

    }

}



