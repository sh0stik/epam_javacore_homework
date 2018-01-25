package codingbat.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class String2Test {
    private String2 str = new String2();

    @Test
    public void testCountCode() {
        assertEquals(1, str.countCode("aaacodebbb"));
    }
}