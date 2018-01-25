package codingbat.array;


public class Array3 {
    public int maxSpan(int[] nums) {
        int span;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;

            while (nums[i] != nums[j])
                j--;

            span = j - i + 1;

            if (span > max)
                max = span;
        }
        return max;
    }

    public static int[] fix34(int[] nums) {
        int j = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                for (; nums[j] != 4; j++) ;
                nums[j] = nums[i + 1];
                nums[i + 1] = 4;
            }
        }
        return nums;
    }

    public int[] fix45(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {

                for (; !(nums[j] == 5 && (j == 0 || j > 0 && nums[j - 1] != 4)); j++) ;
                nums[j] = nums[i + 1];
                nums[i + 1] = 5;
            }

        }
        return nums;
    }


    public boolean canBalance(int[] nums) {
        int left = 0;
        int right;
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
        }
        right = nums[nums.length - 1];
        for (int i = nums.length - 2; i > 0; i--) {
            if (left == right) {
                return true;
            }
            left -= nums[i];
            right += nums[i];
        }
        return (left == right);
    }


    public boolean linearIn(int[] outer, int[] inner) {
        boolean notFound;
        for (int i = 0; i < inner.length; i++) {
            notFound = true;
            for (int j = 0; j < outer.length; j++) {
                if (inner[i] == outer[j]) notFound = false;
            }
            if (notFound) return false;
        }
        return true;
    }

    public int[] squareUp(int n) {
        int[] arr = new int[n * n];
        int p;

        for (int i = 1; i <= n; i++) {
            p = n * i - 1;
            for (int j = 1; j <= i; j++, p--) {
                arr[p] = j;
            }
        }
        return arr;
    }

    public int[] seriesUp(int n) {

        int p = 0;
        int[] arr = new int[n * (n + 1) / 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 10; j <= i; j++, p++) {
                arr[p] = j;
            }
        }
        return arr;
    }

    public int lastIndexOf(int[] nums, int value, int index) {
        for (; index >= 0; index--) {
            if (nums[index] == value)
                return index;
        }
        return -1;
    }

    public int maxMirror(int[] nums) {
        int span;
        int maxSpan = 0;
        int left;
        int right;
        for (int i = 0; i < nums.length; i++) {
            left = i;
            right = lastIndexOf(nums, nums[i], nums.length - 1);
            while (right != -1) {
                span = 0;
                left = i;
                do {
                    left++;
                    right--;
                    span++;
                } while (left < nums.length && right >= 0 && nums[left] == nums[right]);
                if (span > maxSpan)
                    maxSpan = span;
                right = lastIndexOf(nums, nums[i], right);
            }
        }
        return maxSpan;
    }

    public int countClumps(int[] nums) {
        int clumps = 0;
        boolean isClump = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (isClump) {
                if (nums[i] != nums[i + 1])
                    isClump = false;
            } else if (nums[i] == nums[i + 1]) {
                isClump = true;
                clumps++;
            }
        }
        return clumps;
    }

    public static void main(String[] args) {
        fix34(new int[]{1, 3, 1, 4, 4, 3, 1});
    }
}



