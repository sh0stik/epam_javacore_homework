package codingbat.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class Recursion2Test {
    private Recursion2 rec = new Recursion2();

    @Test
    public void testGroupSum() {
        assertEquals(true, rec.groupSum(0, new int[]{2, 4, 8}, 10));
        assertEquals(true, rec.groupSum(0, new int[]{2, 4, 8}, 14));
        assertEquals(false, rec.groupSum(0, new int[]{2, 4, 8}, 9));
    }

    @Test
    public void testGroupSum6() {
        assertEquals(true, rec.groupSum6(0, new int[]{5, 6, 2}, 8));
        assertEquals(false, rec.groupSum6(0, new int[]{5, 6, 2}, 9));
        assertEquals(false, rec.groupSum6(0, new int[]{5, 6, 2}, 7));
    }

    @Test
    public void testGroupNoAdj() {
        assertEquals(true, rec.groupNoAdj(0, new int[]{2, 5, 10, 4}, 12));
        assertEquals(false, rec.groupNoAdj(0, new int[]{2, 5, 10, 4}, 14));
        assertEquals(false, rec.groupNoAdj(0, new int[]{2, 5, 10, 4}, 7));
    }

    @Test
    public void testGroupSum5() {
        assertEquals(true, rec.groupSum5(0, new int[]{2, 5, 10, 4}, 19));
        assertEquals(true, rec.groupSum5(0, new int[]{2, 5, 10, 4}, 17));
        assertEquals(false, rec.groupSum5(0, new int[]{2, 5, 10, 4}, 12));
        assertEquals(false, rec.groupSum5(0, new int[]{2, 5, 4, 10}, 12));
        assertEquals(false, rec.groupSum5(0, new int[]{3, 5, 1}, 9));
    }

    @Test
    public void testGroupSumClump() {
        assertEquals(true, rec.groupSumClump(0, new int[]{2, 4, 8}, 10));
        assertEquals(true, rec.groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14));
        assertEquals(false, rec.groupSumClump(0, new int[]{2, 4, 4, 8}, 14));
    }

    @Test
    public void testSplitArray() {
        assertEquals(true, rec.splitArray(new int[]{2, 2}));
        assertEquals(false, rec.splitArray(new int[]{2, 3}));
        assertEquals(true, rec.splitArray(new int[]{5, 2, 3}));
    }

    @Test
    public void testSplitOdd10() {
        assertEquals(true, rec.splitOdd10(new int[]{5, 5, 5}));
        assertEquals(false, rec.splitOdd10(new int[]{5, 5, 6}));
        assertEquals(true, rec.splitOdd10(new int[]{5, 5, 6, 1}));
    }

    @Test
    public void testSplit53() {
        assertEquals(true, rec.split53(new int[]{1, 1}));
//        assertEquals(false, rec.split53(new int[]{1, 1, 1}));
//        assertEquals(true, rec.split53(new int[]{2, 4, 2}));
    }

}