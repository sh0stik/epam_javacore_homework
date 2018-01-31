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


}