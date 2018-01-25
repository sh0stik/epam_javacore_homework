package codingbat.ap;

import sun.nio.cs.ext.MacArabic;

import java.util.ArrayList;
import java.util.List;

public class AP1 {

    public boolean scoresIncreasing(int[] scores) {
        boolean test = false;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i + 1] >= scores[i]) {
                test = true;
            } else return false;
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        boolean tetst = false;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] != 100) {
                tetst = false;
            } else if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 3; i++) {
            if (scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        int stAv = average(scores, 0, scores.length / 2);
        int enAv = average(scores, scores.length / 2, scores.length);
        return Math.max(stAv, enAv);
    }

    public int average(int[] scores, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++)
            sum += scores[i];

        return sum / (end - start);
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count++;
            }
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = words[i];
        }

        return arr;
    }

    public List wordsWithoutList(String[] words, int len) {
        List list = new ArrayList();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                list.add(words[i]);
            }
        }
        return list;
    }

    public boolean hasOne(int n) {
        while (n != 0) {
            if (n % 10 == 1)
                return true;

            n /= 10;
        }

        return false;
    }

    public boolean dividesSelf(int n) {
        for (int val = n; val != 0; val /= 10) {
            int a = val % 10;
            if (a == 0 || n % a != 0) {
                return false;
            }
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;

        for (int i = 0; index < count; i++) {

            if (nums[i] % 2 == 0) {
                arr[index] = nums[i];
                index++;
            }

        }
        return arr;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;
        for (int i = 0; index < count; i++) {

            if (isEndy(nums[i])) {
                arr[index] = nums[i];
                index++;
            }

        }
        return arr;
    }

    public boolean isEndy(int n) {
        return ((n >= 0 && n <= 10) || (n >= 90 && n <= 100));
    }

    public int matchUp(String[] a, String[] b) {
        int len = a.length;
        int mutch = 0;

        for (int i = 0; i < len; i++) {
            if (a[i].length() > 0 && b[i].length() > 0 && a[i].substring(0, 1).equals(b[i].substring(0, 1))) {
                mutch++;
            }

        }
        return mutch;
    }


    public int scoreUp(String[] key, String[] answers) {
        int len = key.length;
        int score = 0;

        for (int i = 0; i < len; i++) {
            if (answers[i].equals(key[i])) {
                score += 4;
            } else if (answers[i].equals("?") || answers[i].equals("")) {
                score += 0;
            } else {
                score -= 1;
            }
        }
        return score;
    }

    public String[] wordsWithout(String[] words, String target) {
        int ind = 0;
        String[] arr = new String[len(words, target)];
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                arr[ind] = words[i];
                ind++;
            }
        }
        return arr;
    }

    public int len(String[] mas, String wo) {
        int num = 0;

        for (int i = 0; i < mas.length; i++) {
            if (!mas[i].equals(wo)) {
                num++;
            }
        }
        return num;
    }

    public int scoresSpecial(int[] a, int[] b) {
        int sum = scoresSpecial(a) + scoresSpecial(b);
        return sum;
    }

    public int scoresSpecial(int[] n) {
        int max = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 10 == 0 && n[i] > max) {
                max = n[i];
            }
        }
        return max;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum = sum + Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (heights[i] < heights[i + 1])
                sum = sum + 2 * (heights[i + 1] - heights[i]);
            else
                sum = sum + heights[i] - heights[i + 1];
        }
        return sum;

    }

    public int bigHeights(int[] heights, int start, int end) {
        int bigStep = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                bigStep++;
            }
        }
        return bigStep;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aName.compareTo(bName) < 0) {
            return -1;
        } else if (aName.compareTo(bName) > 0) {
            return 1;
        } else if (aId < bId) {
            return -1;
        } else if (aId > bId) {
            return 1;
        }

        return 0;
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] arr = new String[n];
        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < n; i++) {
            if (a[aIndex].compareTo(b[bIndex]) < 0) {
                arr[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex].compareTo(b[bIndex]) > 0) {
                arr[i] = b[bIndex];
                bIndex++;
            } else {
                arr[i] = a[aIndex];
                aIndex++;
                bIndex++;
            }
        }

        return arr;
    }

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        int aIndex = 0;
        int bIndex = 0;

        if (a[0].equals(b[0])) {
            count++;
            aIndex++;
            bIndex++;
        } else if (a[0].compareTo(b[0]) < 0) {
            aIndex++;
        } else {
            bIndex++;
        }

        while (aIndex < a.length && bIndex < b.length) {
            if (aIndex > 0 && a[aIndex - 1].equals(a[aIndex])) {
                aIndex++;
            } else if (a[aIndex].equals(b[bIndex])) {
                count++;
                aIndex++;
                bIndex++;
            } else if (a[aIndex].compareTo(b[bIndex]) < 0) {
                aIndex++;
            } else {
                bIndex++;
            }
        }

        return count;
    }


}
