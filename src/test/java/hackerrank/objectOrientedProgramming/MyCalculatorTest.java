package hackerrank.objectOrientedProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyCalculatorTest {
    MyCalculator myCalculator = new MyCalculator();

@Test
    public void testRecSum(){
    assertEquals(12, myCalculator.divisor_sum(6));
}
}