package codingbat.array;

import java.io.FileOutputStream;

public class Array2 {
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count++;
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        int max = 0;
        int min = nums[0];
        for (int num1 : nums) {
            if (num1 > max) max = num1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
        }
        return max - min;
    }

    public static int centeredAverage(int[] nums) {
        int max = 0;
        int min = nums[0];
        int sum = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
            sum = sum + nums[i];
        }
        int cen = (sum - max - min) / (nums.length - 2);
        return cen;
    }

    public static int sum13(int[] nums) {
        int sum = 0;

        if (nums.length == 0) return 0;
        for (int i = 0; i <= nums.length - 1; i++) {

            if (nums[i] == 13) i++;
            else sum += nums[i];

        }
        return sum;
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean test = false;
        if (nums.length == 0) return 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 6) test = true;
            if (!test) sum = sum + nums[i];
            if (test && nums[i] == 7) test = false;
        }

        return sum;
    }

    public boolean has22(int[] nums) {
        int len = nums.length - 1;

        for (int i = 0; i <= len; i++) {
            if (i <= len - 1 && nums[i] == 2 && nums[i + 1] == 2) return true;
            if (len <= 1 || nums[len - 1] != 2 && nums[len] == 2) return false;
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        int len = nums.length - 1;
        int i = 0;
        while (i <= len) {
            if (nums[i] == 1 || nums[i] == 3) return false;
            i++;
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int len = nums.length - 1;
        int sum = 0;
        for (int i = 0; i <= len; i++) {
            if (nums[i] == 2) sum = sum + nums[i];
        }
        return sum == 8;

    }

    public static boolean more14(int[] nums) {
        int balance = 0;
        for (int num : nums) {
            if (num == 1)
                balance++;
            else if (num == 4)
                balance--;
        }
        return (balance > 0);
    }

    public int[] fizzArray(int n) {
        int[] nums = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            nums[i] = i;
        }
        return nums;
    }

    public boolean only14(int[] nums) {
        if (nums.length < 1) return true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) return false;
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        int[] nums = new int[n];
        String[] arr = new String[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = "" + i;
        }
        return arr;
    }

    public boolean no14(int[] nums) {
        boolean noOne = true;
        boolean noFour = true;
        for (int num : nums) {
            if (num == 1) noOne = false;
            else if (num == 4) noFour = false;
        }
        return (noOne || noFour);
    }


    public boolean isEverywhere(int[] nums, int val) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val)
                return false;
        }
        return true;
    }

    public boolean either24(int[] nums) {
        int len = nums.length;
        int count2 = 0;
        int count4 = 0;
        for (int i = 0; i < len; i++) {

            if (i <= len - 2 && nums[i] == 2 && nums[i + 1] == 2) count2++;
            if (i <= len - 2 && nums[i] == 4 && nums[i + 1] == 4) count4++;
        }
        return (count2 != count4);
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i <= nums1.length - 1; i++) {
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) count++;
        }
        return count;

    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i <= nums.length - 2 && nums[i] == 7 && (nums[i + 1] == 7)) return true;
            if (i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7) return true;
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean test = false;
        for (int i = 0; i < nums.length; i++) {
            if (test) {
                if (nums[i] == 2) return true;
            } else if (nums[i] == 1) test = true;

        }
        return false;
    }

    public boolean modThree(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2 && nums[i] % 2 == nums[i + 2] % 2)
                return true;
        }
        return false;
    }

    public boolean haveThree(int[] nums) {
        int count = 0;
        boolean test = false;
        for (int i = 0; i < nums.length && count <= 3; i++) {
            if (nums[i] == 3) {
                if (test)
                    return false;
                else {
                    count++;
                    test = true;
                }
            } else
                test = false;
        }
        return (count == 3);
    }

    public boolean twoTwo(int[] nums) {
        if (nums.length == 1 && nums[0] == 2)
            return false;

        if (nums.length >= 2 && ((nums[0] == 2 && nums[1] != 2) ||
                (nums[nums.length - 1] == 2 && nums[nums.length - 2] != 2)))
            return false;

        for (int i = 1; i <= nums.length - 2; i++) {
            if (nums[i] == 2 && nums[i - 1] != 2 && nums[i + 1] != 2)
                return false;
        }
        return true;
    }


    public boolean tripleUp(int[] nums) {
        if (nums.length < 3) return false;

        if ((nums.length >= 3 && nums[0] == nums[1] - 1 && nums[1] == nums[2] - 1) ||
                (nums[nums.length - 1] == nums[nums.length - 2] + 1 && nums[nums.length - 2] == nums[nums.length - 3] + 1))
            return true;

        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] == (nums[i + 1] - 1) && nums[i + 1] == (nums[i + 2] - 1))
                return true;
        }
        return false;
    }


    public static int[] fizzArray3(int start, int end) {
        if (end == start) return new int[]{};
        int n = end - start;
        int[] nums = new int[n];
        nums[0] = start;
        for (int i = 1; i <= n - 1; i++) {
            nums[i] = nums[i - 1] + 1;
        }
        return nums;
    }

    public static boolean sameEnds(int[] nums, int len) {
        if (nums.length == len) return true;
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length < 1) return nums;

        int len = nums.length - 1;
        int a = nums[0];

        for (int i = 1; i <= nums.length - 1; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = a;

        return nums;
    }

    public static int[] tenRun(int[] nums) {
        int cur;
        int i = 0;

        while (i < nums.length && nums[i] % 10 != 0) {
            i++;
        }

        if (i >= nums.length) return nums;

        cur = nums[i];
        i++;

        while (i < nums.length) {
            if (nums[i] % 10 == 0) {
                cur = nums[i];
            } else {
                nums[i] = cur;
            }
            i++;
        }
        return nums;
    }

    public static int[] pre4(int[] nums) {
        int count = 0;
        int[] arr;

        while (nums[count] != 4) {
            count++;
        }

        arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = nums[i];
        }

        return arr;

    }

    public int[] post4(int[] nums) {
        int[] arr;
        int n = nums.length - 1;

        while (nums[n] != 4) {
            n--;
        }

        arr = new int[nums.length - 1 - n];

        for (int i = n + 1; i < nums.length; i++) {
            arr[i - n - 1] = nums[i];
        }
        return arr;

    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val) {
                if (nums[i - 1] != val && nums[i + 1] != val) {

                    if (nums[i - 1] > nums[i + 1] && nums[i] < nums[i - 1]) {
                        nums[i] = nums[i - 1];
                    } else if (nums[i + 1] > nums[i - 1] && nums[i] < nums[i + 1]) nums[i] = nums[i + 1];
                }
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[a];
                nums[a] = 0;
                a++;
            }
        }
        return nums;
    }

    public static int[] withoutTen(int[] nums) {
        int[] arr = new int[nums.length];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                arr[a] = nums[i];

                a++;
            }
        }
        return arr;
    }

    public static int[] zeroMax(int[] nums) {
        boolean test = false;
        for (int i = 0; i < nums.length; i++) {

            int maxOdd = 0;
            if (nums[i] == 0) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] > maxOdd && nums[j] % 2 != 0)
                        maxOdd = nums[j];
                    test = true;
                }
                if (i != nums.length - 1 && test) {
                    nums[i] = maxOdd;
                }

            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int b = nums[a];
                nums[a] = nums[i];
                nums[i] = b;
                a++;
            }
        }
        return nums;
    }

    public String[] fizzBuzz(int start, int end) {
        int n = end - start;
        int[] nums = new int[n];
        String[] arr = new String[n];

        for (int j = 0; j < n; j++) {
            nums[j] = start++;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] % 15 != 0 && nums[i] % 3 != 0 && nums[i] % 5 != 0) {
                arr[i] = "" + nums[i];
            } else if (nums[i] % 15 == 0) {
                arr[i] = "FizzBuzz";
            } else if (nums[i] % 3 == 0) {
                arr[i] = "Fizz";
            } else if (nums[i] % 5 == 0) {
                arr[i] = "Buzz";
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(zeroMax(new int[]{7, 0, 1, 0, 0, 7}));
//        bigDiff(new int[] {10, 3, 5, 6});
//        System.out.println(centeredAverage(new int[]{1, 2, 3, 4, 100}));
    }

}
