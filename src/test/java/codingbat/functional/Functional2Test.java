package codingbat.functional;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Functional2Test {
    private Functional2 functional2 = new Functional2();

    @Test
    public void testNoNeg() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(-2);
        assertEquals(expected, functional2.noNeg(actual));
    }

    @Test
    public void testNo9() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(19);
        assertEquals(expected, functional2.no9(actual));
    }

    @Test
    public void testNoTeen() {
        List<Integer> expected = new ArrayList<>();
        expected.add(12);
        expected.add(20);
        List<Integer> actual = new ArrayList<>();
        actual.add(12);
        actual.add(13);
        actual.add(19);
        actual.add(20);
        assertEquals(expected, functional2.noTeen(actual));
    }

    @Test
    public void testNoLong() {
        List<String> expected = new ArrayList<>();
        expected.add("not");
        expected.add("too");
        List<String> actual = new ArrayList<>();
        actual.add("this");
        actual.add("not");
        actual.add("too");
        actual.add("long");
        assertEquals(expected, functional2.noLong(actual));
    }

    @Test
    public void testNoZ() {
        List<String> expected = new ArrayList<>();
        expected.add("aaa");
        expected.add("bbb");
        List<String> actual = new ArrayList<>();
        actual.add("aaa");
        actual.add("bbb");
        actual.add("aza");
        assertEquals(expected, functional2.noZ(actual));
    }

    @Test
    public void testNo34() {
        List<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("bb");
        List<String> actual = new ArrayList<>();
        actual.add("a");
        actual.add("bb");
        actual.add("ccc");
        assertEquals(expected, functional2.no34(actual));
    }

    @Test
    public void testNoYY() {
        List<String> expected = new ArrayList<>();
        expected.add("ay");
        expected.add("by");
        expected.add("cy");
        List<String> actual = new ArrayList<>();
        actual.add("a");
        actual.add("b");
        actual.add("c");
        assertEquals(expected, functional2.noYY(actual));
    }

    @Test
    public void testTwo2() {
        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(6);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        assertEquals(expected, functional2.two2(actual));
    }

    @Test
    public void testSquare56() {
        List<Integer> expected = new ArrayList<>();
        expected.add(19);
        expected.add(11);
        List<Integer> actual = new ArrayList<>();
        actual.add(3);
        actual.add(1);
        actual.add(4);
        assertEquals(expected, functional2.square56(actual));
    }
}