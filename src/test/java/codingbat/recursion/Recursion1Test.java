package codingbat.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class Recursion1Test {
    private Recursion1 rec = new Recursion1();

    @Test
    public void testCountHi() {
        assertEquals(2, rec.countHi("xhixhix"));
    }

    @Test
    public void testChangeXY() {
        assertEquals("yyhiyy", rec.changeXY("xxhixx"));
    }

    @Test
    public void testChangePi() {
        assertEquals("x3.14x", rec.changePi("xpix"));
        assertEquals("3.143.14", rec.changePi("pipi"));
        assertEquals("3.14p", rec.changePi("pip"));
    }

    @Test
    public void testNoX() {
        assertEquals("ab", rec.noX("xaxb"));
        assertEquals("abc", rec.noX("abc"));
        assertEquals("", rec.noX("xx"));
    }

    @Test
    public void testArray6() {
        assertEquals(true, rec.array6(new int[]{1, 6, 4}, 0));
        assertEquals(false, rec.array6(new int[]{1, 4}, 0));
        assertEquals(true, rec.array6(new int[]{6}, 0));
    }

    @Test
    public void testArray11() {
        assertEquals(1, rec.array11(new int[]{1, 2, 11}, 0));
        assertEquals(2, rec.array11(new int[]{11, 11}, 0));
        assertEquals(0, rec.array11(new int[]{1, 2, 3, 4}, 0));
    }

    @Test
    public void testArray220() {
        assertEquals(true, rec.array220(new int[]{1, 2, 20}, 0));
        assertEquals(true, rec.array220(new int[]{3, 30}, 0));
        assertEquals(false, rec.array220(new int[]{3}, 0));
    }

    @Test
    public void testAllStar() {
        assertEquals("h*e*l*l*o", rec.allStar("hello"));
        assertEquals("a*b*c", rec.allStar("abc"));
        assertEquals("a*b", rec.allStar("ab"));
        assertEquals("", rec.allStar(""));
    }

    @Test
    public void testPairStar() {
        assertEquals("hel*lo", rec.pairStar("hello"));
        assertEquals("x*xy*y", rec.pairStar("xxyy"));
        assertEquals("a*a*a*a", rec.pairStar("aaaa"));
    }

    @Test
    public void testEndX() {
        assertEquals("rexx", rec.endX("xxre"));
        assertEquals("hixxxx", rec.endX("xxhixx"));
        assertEquals("hihixxx", rec.endX("xhixhix"));
    }

    @Test
    public void testCountPairs() {
        assertEquals(1, rec.countPairs("axa"));
        assertEquals(2, rec.countPairs("axax"));
        assertEquals(1, rec.countPairs("axbx"));
    }

    @Test
    public void testCountAbc() {
        assertEquals(1, rec.countAbc("abc"));
        assertEquals(2, rec.countAbc("abcxxabc"));
        assertEquals(2, rec.countAbc("abaxxaba"));
    }

    @Test
    public void testCount11() {
        assertEquals(2, rec.count11("11abc11"));
        assertEquals(3, rec.count11("abc11x11x11"));
        assertEquals(1, rec.count11("111"));
    }

    @Test
    public void testStringClean() {
        assertEquals("yza", rec.stringClean("yyzzza"));
        assertEquals("abcd", rec.stringClean("abbbcdd"));
        assertEquals("Helo", rec.stringClean("Hello"));
    }

    @Test
    public void testCountHi2() {
        assertEquals(1, rec.countHi2("ahixhi"));
        assertEquals(2, rec.countHi2("ahibhi"));
        assertEquals(0, rec.countHi2("xhixhi"));
        assertEquals(3, rec.countHi2("hihihi"));
    }

    @Test
    public void testParenBit() {
        assertEquals("(abc)", rec.parenBit("xyz(abc)123"));
        assertEquals("(hello)", rec.parenBit("x(hello)"));
        assertEquals("(xy)", rec.parenBit("(xy)1"));
    }

    @Test
    public void testNestParen(){
        assertEquals(true, rec.nestParen("(())"));
        assertEquals(true, rec.nestParen("((()))"));
        assertEquals(false, rec.nestParen("(((x))"));
    }
    @Test
    public void testStrCount(){
        assertEquals(2, rec.strCount("catcowcat", "cat"));
        assertEquals(1, rec.strCount("catcowcat", "cow"));
        assertEquals(0, rec.strCount("catcowcat", "dog"));
    }

    @Test
    public void testStrCopies() {
        assertEquals(true, rec.strCopies("catcowcat", "cat",2));
        assertEquals(false, rec.strCopies("catcowcat", "cow",2));
        assertEquals(true, rec.strCopies("catcowcat", "cow",1));
    }
 @Test
    public void testStrDist() {
        assertEquals(9, rec.strDist("catcowcat", "cat"));
        assertEquals(3, rec.strDist("catcowcat", "cow"));
        assertEquals(9, rec.strDist("cccatcowcatxx", "cat"));
    }

}