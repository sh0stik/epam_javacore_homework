package codingbat.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Map2Test {
    Map2 map2 = new Map2();

    @Test
    public void testWord0(){
        String[] actual = new String[]{"a", "b", "a", "b"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 0);
        expected.put("b", 0);
        assertEquals(expected, map2.word0(actual));
    }
     @Test
    public void testWordLen(){
        String[] actual = new String[]{"a", "bb", "a", "bb"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("bb", 2);
        expected.put("a", 1);
        assertEquals(expected, map2.wordLen(actual));

     }
 @Test
    public void testPairs(){
        String[] actual = new String[]{"code", "bug"};
        Map<String, String> expected = new HashMap<>();
        expected.put("b", "g");
        expected.put("c", "e");
        assertEquals(expected, map2.pairs(actual));

     }
    @Test
    public void testWordCount(){
        String[] actual = new String[]{"a", "b", "a", "c", "b"};
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        expected.put("c", 1);
        assertEquals(expected, map2.wordCount(actual));
    }
    @Test
    public void testFirstChar(){
        String[] actual = new String[]{"salt", "tea", "soda", "toast"};
        Map<String, String> expected = new HashMap<>();
        expected.put("s", "saltsoda");
        expected.put("t", "teatoast");
        assertEquals(expected, map2.firstChar(actual));
    }

    @Test
    public void testWordAppend() {
        String[] actual = new String[]{"a", "b", "a"};
        String expected = "a";
        assertEquals(expected, map2.wordAppend(actual));
    }

    @Test
    public void testWordMultiple() {
        String[] actual = new String[]{"a", "b", "a", "c", "b"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);
        assertEquals(expected, map2.wordMultiple(actual));
    }
    @Test
    public void testAllSwap() {
        String[] actual = new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] expected = {"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"};
        assertArrayEquals(expected, map2.allSwap(actual));
    }
@Test
    public void testFirstSwap() {
        String[] actual = new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] expected = {"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"};
        assertArrayEquals(expected, map2.firstSwap(actual));
    }

}