package codingbat.functional;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Functional1Test {
    private Functional1 functional1 = new Functional1();

    @Test
    public void testDoubling() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        assertEquals(expected, functional1.doubling(actual));
    }

    @Test
    public void testSquare() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);
        expected.add(9);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        assertEquals(expected, functional1.square(actual));
    }

    @Test
    public void testAddStar() {
        List<String> expected = new ArrayList<>();
        expected.add("a*");
        expected.add("bb*");
        expected.add("ccc*");
        List<String> actual = new ArrayList<>();
        actual.add("a");
        actual.add("bb");
        actual.add("ccc");
        assertEquals(expected, functional1.addStar(actual));
    }

    @Test
    public void testCopies3() {
        List<String> expected = new ArrayList<>();
        expected.add("aaa");
        expected.add("bbbbbb");
        expected.add("ccccccccc");
        List<String> actual = new ArrayList<>();
        actual.add("a");
        actual.add("bb");
        actual.add("ccc");
        assertEquals(expected, functional1.copies3(actual));
    }

    @Test
    public void testMoreY() {
        List<String> expected = new ArrayList<>();
        expected.add("yay");
        expected.add("yby");
        expected.add("ycy");
        List<String> actual = new ArrayList<>();
        actual.add("a");
        actual.add("b");
        actual.add("c");
        assertEquals(expected, functional1.moreY(actual));
    }

    @Test
    public void testMath1() {
        List<Integer> expected = new ArrayList<>();
        expected.add(20);
        expected.add(30);
        expected.add(40);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        assertEquals(expected, functional1.math1(actual));
    }

    @Test
    public void testRightDigit() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(22);
        actual.add(93);
        assertEquals(expected, functional1.rightDigit(actual));
    }

    @Test
    public void testLower() {
        List<String> expected = new ArrayList<>();
        expected.add("hello");
        expected.add("hi");
        List<String> actual = new ArrayList<>();
        actual.add("Hello");
        actual.add("Hi");
        assertEquals(expected, functional1.lower(actual));
    }

    @Test
    public void testNoX() {
        List<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("bb");
        expected.add("c");
        List<String> actual = new ArrayList<>();
        actual.add("ax");
        actual.add("bb");
        actual.add("cx");
        assertEquals(expected, functional1.noX(actual));
    }
}