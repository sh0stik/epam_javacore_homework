package codingbat.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class Logic1Test {
    private Logic1 logic1 = new Logic1();

    @Test
    public void testCigarParty() {
        assertEquals(false, logic1.cigarParty(30, false));
        assertEquals(true, logic1.cigarParty(50, false));
        assertEquals(true, logic1.cigarParty(70, true));
    }

    @Test
    public void testDateFashion() {
        assertEquals(2, logic1.dateFashion(5, 10));
        assertEquals(0, logic1.dateFashion(5, 2));
        assertEquals(1, logic1.dateFashion(5, 5));
    }

    @Test
    public void testSquirrelPlay() {
        assertEquals(true, logic1.squirrelPlay(70, false));
        assertEquals(false, logic1.squirrelPlay(95, false));
        assertEquals(true, logic1.squirrelPlay(95, true));
    }

    @Test
    public void testCaughtSpeeding() {
        assertEquals(0, logic1.caughtSpeeding(60, false));
        assertEquals(1, logic1.caughtSpeeding(65, false));
        assertEquals(0, logic1.caughtSpeeding(65, true));
    }

    @Test
    public void testSortaSum() {
        assertEquals(7, logic1.sortaSum(3, 4));
        assertEquals(20, logic1.sortaSum(9, 4));
        assertEquals(21, logic1.sortaSum(10, 11));
    }

    @Test
    public void testAlarmClock() {
        assertEquals("7:00", logic1.alarmClock(1, false));
        assertEquals("7:00", logic1.alarmClock(5, false));
        assertEquals("10:00", logic1.alarmClock(0, false));
    }

    @Test
    public void testLove6() {
        assertEquals(true, logic1.love6(6, 4));
        assertEquals(false, logic1.love6(4, 5));
        assertEquals(true, logic1.love6(1, 5));
    }

    @Test
    public void testIn1To10() {
        assertEquals(true, logic1.in1To10(5, false));
        assertEquals(false, logic1.in1To10(11, false));
        assertEquals(true, logic1.in1To10(11, true));
    }

    @Test
    public void testSpecialEleven() {
        assertEquals(true, logic1.specialEleven(22));
        assertEquals(true, logic1.specialEleven(23));
        assertEquals(false, logic1.specialEleven(24));
    }

    @Test
    public void testMore20() {
        assertEquals(false, logic1.more20(20));
        assertEquals(true, logic1.more20(21));
        assertEquals(true, logic1.more20(22));
    }

    @Test
    public void testOld35() {
        assertEquals(true, logic1.old35(3));
        assertEquals(true, logic1.old35(10));
        assertEquals(false, logic1.old35(15));
    }

    @Test
    public void testLess20() {
        assertEquals(true, logic1.less20(18));
        assertEquals(true, logic1.less20(19));
        assertEquals(false, logic1.less20(20));
    }

    @Test
    public void testNearTen() {
        assertEquals(true, logic1.nearTen(12));
        assertEquals(false, logic1.nearTen(17));
        assertEquals(true, logic1.nearTen(19));
    }

    @Test
    public void testTeenSum() {
        assertEquals(7, logic1.teenSum(3, 4));
        assertEquals(19, logic1.teenSum(10, 13));
        assertEquals(19, logic1.teenSum(13, 2));
    }



    @Test
    public void testTeaParty() {
        assertEquals(1, logic1.teaParty(6, 8));
        assertEquals(0, logic1.teaParty(3, 8));
        assertEquals(2, logic1.teaParty(20, 6));
    }

    @Test
    public void testFizzString() {
        assertEquals("Fizz", logic1.fizzString("fig"));
        assertEquals("Buzz", logic1.fizzString("dib"));
        assertEquals("FizzBuzz", logic1.fizzString("fib"));
    }

    @Test
    public void testFizzString2() {
        assertEquals("1!", logic1.fizzString2(1));
        assertEquals("2!", logic1.fizzString2(2));
        assertEquals("Fizz", logic1.fizzString2(3));
    }



    @Test
    public void testInOrder() {
        assertEquals(true, logic1.inOrder(1, 2, 4, false));
        assertEquals(true, logic1.inOrder(1, 2, 4, false));
    }

    }