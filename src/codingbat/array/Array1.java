package codingbat.array;

import java.util.Arrays;

public class Array1 {
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int sum3(int[] nums) {
        int sum = nums[0] + nums[1] + nums[2];
        return sum;
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]) return new int[]{nums[0], nums[0], nums[0]};
        else return new int[]{nums[2], nums[2], nums[2]};
    }

    public int sum2(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length < 2) return nums[0];
        return nums[0] + nums[1];

    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        if (nums.length == 1) return new int[]{nums[0], nums[0]};
        if (nums.length == 2) return nums;
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3);
    }

    public boolean no23(int[] nums) {
        return (!(nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3));
    }

    public int[] makeLast(int[] nums) {
        int[] res = new int[nums.length * 2];
        res[res.length - 1] = nums[nums.length - 1];
        return res;
    }

    public boolean double23(int[] nums) {
        return (nums.length == 2 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)));
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) return new int[]{nums[0], 0, nums[2]};
        if (nums[1] == 2 && nums[2] == 3) return new int[]{nums[0], nums[1], 0};
        return nums;
    }

    public int start1(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) return 0;
        if ((a.length == 0 && b[0] == 1) || (a[0] == 1 && b.length == 0)) return 1;
        if (a[0] == 1 && b[0] == 1) return 2;
        if ((a.length > 0 && b.length > 0) && ((a[0] != 1 && b[0] == 1) || (a[0] == 1 && b[0] != 1))) return 1;
        else return 0;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumA == sumB) return a;
        if (sumA > sumB) return a;
        else return b;
    }

    public int[] makeMiddle(int[] nums) {
        if (nums.length > 2)
            return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
        else return nums;
    }

    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public int[] swapEnds(int[] nums) {
        if (nums.length ==1) return nums;
        int[] res = new int[nums.length];
        res[0] = nums[nums.length-1];
        res[res.length -1] = nums[0];
        for (int i =1; i <=nums.length-2; i++){
            res[i] = nums[i];
        }
        return res;
    }

    public int[] midThree(int[] nums) {
        if (nums.length ==3) return nums;
        int[] res = new int[3];
        for (int i =(nums.length-3)/2; i <=nums.length-(nums.length-3)/2-1; i++){
            res[i-(nums.length-3)/2] = nums[i];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public int maxTriple(int[] nums) {
        if (nums[0] > nums[nums.length-1] && nums[0]> nums[(nums.length-1)/2]) return nums[0];
        if (nums[nums.length-1] > nums[0] && nums[nums.length-1]> nums[(nums.length-1)/2]) return nums[nums.length-1];
        else return nums[(nums.length-1)/2];
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length <= 2) return nums;
        return new int[] {nums[0], nums[1]};
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length <2) return false;
        if ((nums[0] == 1 && nums[1] == 3) || (nums[1] ==1 && nums[2] ==3)) return true;
        if (nums.length >=3 &&(nums[nums.length-2] ==1 && nums[nums.length-1] ==3)) return true;
    return false;
    }

    public int[] make2(int[] a, int[] b) {
        if (a.length==0) return new int[] {b[0], b[1]};
        if (a.length == 1) return new int[]{a[0],b[0]};

        return new int[] {a[0], a[1]};
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length ==0) return new int[] {};
        if (a.length == 0 && b.length >= 1) return new int[] {b[0]};
        if (b.length == 0 && a.length >= 1) return new int[] {a[0]};
        return new int[] {a[0], b[0]};
    }

}
