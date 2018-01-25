package codingbat.string;

public class String3 {

    public int countYZ(String str) {
        int count = 0;
        char ch;
        str = str.toLowerCase();
        ch = str.charAt(0);
        for (int i = 1; i <= str.length() - 1; i++) {
            if (ch == 'y' || ch == 'z') {
                ch = str.charAt(i);
                if (!Character.isLetter(ch))
                    count++;
            } else
                ch = str.charAt(i);
        }
        if (ch == 'y' || ch == 'z')
            count++;
        return count;
    }


    public String withoutString(String base, String remove) {
        char[] arr = new char[base.length()];
        int count = 0;
        int i = 0;

        while (i <= base.length() - remove.length()) {
            if (base.substring(i, i + remove.length()).toLowerCase().equals(
                    remove.toLowerCase())) {
                i += remove.length();
            } else {
                arr[count] = base.charAt(i);
                count++;
                i++;
            }
        }

        while (i < base.length()) {
            arr[count] = base.charAt(i);
            count++;
            i++;
        }

        return new String(arr, 0, count);
    }

    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("is")) countIs++;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("not")) countNot++;
        }
        return (countIs == countNot);
    }


    public boolean gHappy(String str) {
        if (str.length() == 1 && str.charAt(0) == 'g') {
            return false;
        }

        if (str.length() >= 2 && (str.charAt(0) == 'g' && str.charAt(1) != 'g' ||
                str.charAt(str.length() - 1) == 'g' && str.charAt(str.length() - 2) != 'g')) {
            return false;
        }

        for (int i = 1; i <= str.length() - 2; i++) {
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {

                return false;
            }
        }
        return true;
    }

    public int countTriple(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum = sum + Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return sum;
    }

    public String sameEnds(String string) {
        String str;
        int n = string.length();
        int i;
        if (n % 2 == 1) {
            i = n / 2;
            n = i + 1;
        } else {
            i = n / 2;
            n = i;
        }
        for (; i >= 1; i--, n++) {
            str = string.substring(0, i);
            if (str.equals(string.substring(n))) {
                return str;
            }
        }
        return "";
    }

    public String mirrorEnds(String string) {
        int len = string.length();
        int n = len - 1;
        for (int i = 0; i < len; i++, n--) {
            if (string.charAt(i) != string.charAt(n)) {
                return string.substring(0, i);
            }
        }
        return string;
    }

    public int maxBlock(String str) {
        int stLen = str.length();
        int maxBlock = 0;
        int block = 1;
        char ch;
        char current;
        if (stLen == 0) return 0;
        ch = str.charAt(0);
        for (int i = 1; i < stLen; i++) {
            current = str.charAt(i);
            if (current == ch) {
                block++;
            } else {
                if (block > maxBlock) {
                    maxBlock = block;
                }
                ch = current;
                block = 1;
            }
        }
        if (block > maxBlock) {
            maxBlock = block;
        }
        return maxBlock;
    }

    public int sumNumbers(String str) {
        int len = str.length();
        int sum = 0;
        String tmp = "";

        for (int i = 0; i < len; i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (i < len - 1 && Character.isDigit(str.charAt(i + 1))) {
                    tmp += str.charAt(i);
                } else {
                    tmp += str.charAt(i);
                    sum += Integer.parseInt(tmp);
                    tmp = "";
                }

            }
        }

        return sum;
    }

    public String notReplace(String str) {
        String result = "";
        int len = str.length();

        for(int i = 0; i < len; i++){
            if(i-1 >= 0 && Character.isLetter(str.charAt(i-1))
                    || i+2 < len && Character.isLetter(str.charAt(i+2))) {
                result += str.charAt(i);
            }
            else if(i+1 < len && str.substring(i, i+2).equals("is")) {
                result += "is not";
                i++;
            }
            else result += str.charAt(i);
        }
        return result;
    }

}
