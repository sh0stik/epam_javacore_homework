package codingbat.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class String2Test {
    private String2 str = new String2();

    @Test
    public void testCountCode() {
        assertEquals(1, str.countCode("aaacodebbb"));
    }

    @Test
    public void testDoubleChar() {
        String expected = "TThhee";
        String actual = "The";
        assertEquals(expected, str.doubleChar(actual));
    }

    @Test
    public void testCountHi() {
        assertEquals(1, str.countHi("abc hi ho"));
    }

    @Test
    public void testCatDog() {
        assertEquals(true, str.catDog("catdog"));
        assertEquals(false, str.catDog("catcat"));
        assertEquals(true, str.catDog("1cat1cadodog"));
    }

    @Test
    public void testEndOther() {
        assertEquals(true, str.endOther("Hiabc", "abc"));
        assertEquals(true, str.endOther("AbC", "HiaBc"));
        assertEquals(true, str.endOther("abc", "abXabc"));
    }

    @Test
    public void testXyzThere() {
        assertEquals(true, str.xyzThere("abcxyz"));
        assertEquals(false, str.xyzThere("abc.xyz"));
        assertEquals(true, str.xyzThere("xyz.abc"));
    }

    @Test
    public void testBobThere() {
        assertEquals(true, str.bobThere("abcbob"));
        assertEquals(true, str.bobThere("b9b"));
        assertEquals(false, str.bobThere("bac"));
    }

    @Test
    public void testXyBalance() {
        assertEquals(true, str.xyBalance("aaxbby"));
        assertEquals(false, str.xyBalance("aaxbb"));
        assertEquals(false, str.xyBalance("yaaxbb"));
    }

    @Test
    public void testMixString() {
        assertEquals("axbycz", str.mixString("abc", "xyz"));
        assertEquals("HTihere", str.mixString("Hi", "There"));
        assertEquals("xTxhxexre", str.mixString("xxxx", "There"));
    }

    @Test
    public void testRepeatEnd() {
        assertEquals("llollollo", str.repeatEnd("Hello", 3));
        assertEquals("lolo", str.repeatEnd("Hello", 2));
        assertEquals("o", str.repeatEnd("Hello", 1));

    }

    @Test
    public void testRepeatFront() {
        assertEquals("ChocChoChC", str.repeatFront("Chocolate", 4));
        assertEquals("ChoChC", str.repeatFront("Chocolate", 3));
        assertEquals("IcI", str.repeatFront("Ice Cream", 2));

    }

    @Test
    public void testRepeatSeparator() {
        assertEquals("WordXWordXWord", str.repeatSeparator("Word", "X", 3));
        assertEquals("ThisAndThis", str.repeatSeparator("This", "And", 2));
        assertEquals("This", str.repeatSeparator("This", "And", 1));
    }

    @Test
    public void testPrefixAgain() {
        assertEquals(true, str.prefixAgain("abXYabc", 1));
        assertEquals(true, str.prefixAgain("abXYabc", 2));
        assertEquals(false, str.prefixAgain("abXYabc", 3));

    }

    @Test
    public void testXyzMiddle() {
        assertEquals(true, str.xyzMiddle("AAxyzBB"));
        assertEquals(true, str.xyzMiddle("AxyzBB"));
        assertEquals(false, str.xyzMiddle("AxyzBBB"));
    }

    @Test
    public void testGetSandwich() {
        assertEquals("jam", str.getSandwich("breadjambread"));
        assertEquals("jam", str.getSandwich("xxbreadjambreadyy"));
        assertEquals("", str.getSandwich("xxbreadyy"));
    }

    @Test
    public void testSameStarChar() {
        assertEquals(true, str.sameStarChar("xy*yzz"));
        assertEquals(false, str.sameStarChar("xy*zzz"));
        assertEquals(true, str.sameStarChar("*xa*az"));

    }

    @Test
    public void testOneTwo() {
        assertEquals("bca", str.oneTwo("abc"));
        assertEquals("cat", str.oneTwo("tca"));
        assertEquals("catdog", str.oneTwo("tcagdo"));

    }

    @Test
    public void testZipZap() {
        assertEquals("zpXzp", str.zipZap("zipXzap"));
        assertEquals("zpzp", str.zipZap("zopzop"));
        assertEquals("zzzpzp", str.zipZap("zzzopzop"));

    }

    @Test
    public void testStarOut() {
        assertEquals("ad", str.starOut("ab*cd"));
        assertEquals("ad", str.starOut("ab**cd"));
        assertEquals("silly", str.starOut("sm*eilly"));

    }

    @Test
    public void testPlusOut() {
        assertEquals("++xy++", str.plusOut("12xy34", "xy"));
        assertEquals("1+++++", str.plusOut("12xy34", "1"));
        assertEquals("++xy++xy+++xy", str.plusOut("12xy34xyabcxy", "xy"));

    }

    @Test
    public void testWordEnds() {
        assertEquals("c13i", str.wordEnds("abcXY123XYijk", "XY"));
        assertEquals("13", str.wordEnds("XY123XY", "XY"));
        assertEquals("11", str.wordEnds("XY1XY", "XY"));

    }
}