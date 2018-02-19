package codingbat.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class String3Test {
    private String3 str = new String3();

    @Test
    public void testCountYZ() {
        assertEquals(2, str.countYZ("fez day"));
        assertEquals(2, str.countYZ("day fez"));
        assertEquals(2, str.countYZ("day fyyyz"));
    }

    @Test
    public void testWithoutString() {
        assertEquals("He there", str.withoutString("Hello there", "llo"));
        assertEquals("Hllo thr", str.withoutString("Hello there", "e"));
        assertEquals("Hello there", str.withoutString("Hello there", "x"));
    }

    @Test
    public void testEqualIsNot() {
        assertEquals(false, str.equalIsNot("This is not"));
        assertEquals(true, str.equalIsNot("This is notnot"));
        assertEquals(true, str.equalIsNot("noisxxnotyynotxisi"));

    }

    @Test
    public void testGHappy() {
        assertEquals(true, str.gHappy("xxggxx"));
        assertEquals(false, str.gHappy("xxgxx"));
        assertEquals(false, str.gHappy("xxggyygxx"));

    }

    @Test
    public void testCountTriple() {
        assertEquals(1, str.countTriple("abcXXXabc"));
        assertEquals(3, str.countTriple("xxxabyyyycd"));
        assertEquals(0, str.countTriple("a"));

    }

    @Test
    public void testSumDigits() {
        assertEquals(6, str.sumDigits("aa1bc2d3"));
        assertEquals(8, str.sumDigits("aa11b33"));
        assertEquals(0, str.sumDigits("Chocolate"));
    }

    @Test
    public void testSameEnds() {
        assertEquals("ab", str.sameEnds("abXYab"));
        assertEquals("x", str.sameEnds("xx"));
        assertEquals("x", str.sameEnds("xxx"));
    }

    @Test
    public void testMirrorEnds() {
        assertEquals("ab", str.mirrorEnds("abXYZba"));
        assertEquals("a", str.mirrorEnds("abca"));
        assertEquals("aba", str.mirrorEnds("aba"));
    }

    @Test
    public void testMaxBlock() {
        assertEquals(2, str.maxBlock("hoopla"));
        assertEquals(3, str.maxBlock("abbCCCddBBBxx"));
        assertEquals(0, str.maxBlock(""));
    }

    @Test
    public void testSumNumbers() {
        assertEquals(123, str.sumNumbers("abc123xyz"));
        assertEquals(44, str.sumNumbers("aa11b33"));
        assertEquals(18, str.sumNumbers("7 11"));
    }

    @Test
    public void testNotReplace() {
        assertEquals("is not test", str.notReplace("is test"));
        assertEquals("is not-is not", str.notReplace("is-is"));
        assertEquals("This is not right", str.notReplace("This is right"));
    }
}