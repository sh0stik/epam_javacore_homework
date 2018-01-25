package codingbat.string;

public class String2 {

    public String doubleChar(String str) {
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            arr.append(str.substring(i, i + 1)).append(str.substring(i, i + 1));
        }
        return arr.toString();
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) count++;
        }
        return count;
    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) countCat++;
            if (str.substring(i, i + 3).equals("dog")) countDog++;
        }
        return (countCat == countDog);
    }

    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e"))
                count++;
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();
        boolean test = false;

        if (a.length() > b.length()) {

            if (lowerA.substring(a.length() - b.length(), a.length()).equals(lowerB)) {
                test = true;
            }

        } else {
            if (lowerB.substring(b.length() - a.length(), b.length()).equals(lowerA)) {
                test = true;
            }

        }
        return test;
    }

    public boolean xyzThere(String str) {
        int len = str.length() - 2;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                if (i == 0 || str.charAt(i - 1) != '.')
                    return true;
            }
        }
        return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
        }
        return false;
    }

    public boolean xyBalance(String str) {
        char ch;
        if (str.length() == 1 && str.equals("x")) return true;
        for (int i = str.length() - 1; i > 0; i--) {
            ch = str.charAt(i);
            if (ch == 'x') {
                return false;
            } else if (ch == 'y') {
                return true;
            }
        }
        return true;

    }

    public String mixString(String a, String b) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; a.length() <= b.length() ? i < a.length() : i < b.length(); i++) {
            str.append(a.charAt(i)).append(b.charAt(i));

        }
        return (str + (a.length() < b.length() ? b.substring(a.length()) : a.substring(b.length())));
    }

    public String repeatEnd(String str, int n) {
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i < n; i++) {
            arr.append(str.substring(str.length() - n));
        }
        return arr.toString();
    }

    public String repeatFront(String str, int n) {
        String arr = "";

        for (int i = 0; i < n; i++) {
            arr = arr + str.substring(0, n - i);
        }
        return arr;
    }

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder arr = new StringBuilder();

        for (int i = 0; i < count; i++) {
            arr.append(i != count - 1 ? word + sep : word);
        }
        return arr.toString();
    }

    public boolean prefixAgain(String str, int n) {
        String prfx = str.substring(0, n);
        return (str.indexOf(prfx, 1) != -1);
    }

    public boolean xyzMiddle(String str) {
        int len = str.length();
        int mid;
        if (len < 3)
            return false;
        mid = len / 2;
        if (len % 2 == 0) {
            if (str.charAt(mid) == 'y')
                return (str.charAt(mid - 1) == 'x' && str.charAt(mid + 1) == 'z');
            if (str.charAt(mid - 1) == 'y')
                return (str.charAt(mid - 2) == 'x' && str.charAt(mid) == 'z');
            return false;
        } else if (str.charAt(mid) == 'y')
            return (str.charAt(mid - 1) == 'x' && str.charAt(mid + 1) == 'z');
        return false;
    }

    public String getSandwich(String str) {
        int bread1 = str.indexOf("bread");
        int bread2 = str.lastIndexOf("bread");
        if (bread1 != -1 && bread2 != -1 && bread1 != bread2)
            return str.substring(bread1 + 5, bread2);
        return "";
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1))
                    return false;
            }
        }
        return true;
    }

    public String oneTwo(String str) {
        String one = "";
        if (str.length() % 3 == 0) {
            for (int i = 0; i < str.length(); i = i + 3) {
                one = one + str.substring(i + 1, i + 3) + str.charAt(i);
            }
        } else {
            int n = str.length() / 3;
            for (int i = 0; i < n * 3; i = i + 3) {
                one = one + str.substring(i + 1, i + 3) + str.charAt(i);
            }
        }
        return one;
    }

    public String zipZap(String str) {
        int i = 0;
        char ch;
        StringBuilder stbuild = new StringBuilder(str.length());
        while (i < str.length()) {
            ch = str.charAt(i);
            if (ch == 'z' && i < str.length() - 2 && str.charAt(i + 2) == 'p') {
                stbuild.append("zp");
                i += 3;
            } else {
                stbuild.append(ch);
                i++;
            }
        }
        return stbuild.toString();
    }

    public String starOut(String str) {
        int[] index = new int[str.length()];
        StringBuilder stbuild = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                index[i] = 1;
                if (i >= 1){
                    index[i - 1] = 1;
                }
                if (i < (str.length() - 1)){
                    index[i + 1] = 1;
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (index[i] == 0){
                stbuild.append(str.charAt(i));
            }
        }
        return stbuild.toString();
    }

    public String plusOut(String str, String word) {
        StringBuilder stbuild = new StringBuilder();
        int index = str.indexOf(word);
        int i = 0;
        while (index != -1) {
            while (i < index){
                stbuild.append("+");
                i++;
            }
            stbuild.append(word);
            i = index + word.length();
            index = str.indexOf(word, i);
        }
        for (; i < str.length(); i++){
            stbuild.append("+");
        }
        return stbuild.toString();
    }

    public String wordEnds(String str, String word) {
        StringBuilder stbuild = new StringBuilder();
        int index = str.indexOf(word);
        int i = 0;
        while(index != -1)
        {
            i = index + word.length();
            if(index >= 1)
                stbuild.append(str.charAt(index-1));
            if(i < str.length())
                stbuild.append(str.charAt(index+word.length()));
            index = str.indexOf(word, i);
        }
        return stbuild.toString();
        }
    }




