package codingbat.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Map1Test {
    Map1 map = new Map1();

    @Test
    public void testMapBully() {
        Map<String, String> expected = new HashMap<>();
        expected.put("a", "");
        expected.put("b", "candy");
        Map<String, String> actual = new HashMap<>();
        actual.put("a", "candy");
        actual.put("b", "dert");
        assertEquals(expected, map.mapBully(actual));
    }

    @Test
    public void testMapShare() {
        Map<String, String> expected = new HashMap<>();
        expected.put("a", "aaa");
        expected.put("b", "aaa");
        Map<String, String> actual = new HashMap<>();
        actual.put("a", "aaa");
        actual.put("b", "bbb");
        actual.put("c", "ccc");

        assertEquals(expected, map.mapShare(actual));
    }

    @Test
    public void testMapAB() {
        Map<String, String> expected = new HashMap<>();
        expected.put("a", "Hi");
        expected.put("ab", "HiThere");
        expected.put("b", "There");
        Map<String, String> actual = new HashMap<>();
        actual.put("a", "Hi");
        actual.put("b", "There");

        assertEquals(expected, map.mapAB(actual));
    }

    @Test
    public void testTopping1() {
        Map<String, String> expected = new HashMap<>();
        expected.put("bread", "butter");
        expected.put("ice cream", "cherry");
        Map<String, String> actual = new HashMap<>();
        actual.put("ice cream", "peanuts");

        assertEquals(expected, map.topping1(actual));
    }
 @Test
    public void testTopping2() {
        Map<String, String> expected = new HashMap<>();
        expected.put("yogurt", "cherry");
        expected.put("ice cream", "cherry");
        Map<String, String> actual = new HashMap<>();
        actual.put("ice cream", "cherry");

        assertEquals(expected, map.topping2(actual));
    }
@Test
    public void testTopping3() {
        Map<String, String> expected = new HashMap<>();
        expected.put("potato", "ketchup");
        expected.put("fries", "ketchup");
        Map<String, String> actual = new HashMap<>();
        actual.put("potato", "ketchup");

        assertEquals(expected, map.topping3(actual));
    }

    @Test
    public void testMapAB2() {
        Map<String, String> expected = new HashMap<>();
        expected.put("c", "cake");
        Map<String, String> actual = new HashMap<>();
        actual.put("a", "aaa");
        actual.put("b", "aaa");
        actual.put("c", "cake");

        assertEquals(expected, map.mapAB2(actual));
    }
@Test
    public void testMapAB3() {
        Map<String, String> expected = new HashMap<>();
        expected.put("a", "aaa");
        expected.put("b", "aaa");
        expected.put("c", "cake");
        Map<String, String> actual = new HashMap<>();
        actual.put("a", "aaa");
        actual.put("c", "cake");

        assertEquals(expected, map.mapAB3(actual));
    }
@Test
    public void testMapAB4() {
        Map<String, String> expected = new HashMap<>();
        expected.put("a", "aaa");
        expected.put("b", "bb");
        expected.put("c", "aaa");
        Map<String, String> actual = new HashMap<>();
        actual.put("a", "aaa");
        actual.put("b", "bb");
        actual.put("c", "cake");
        assertEquals(expected, map.mapAB4(actual));
    }

}