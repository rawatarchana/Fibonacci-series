package com.hva;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FibonacciTest {

    @Test /* for the first number(0) and the index is 0 */
    public void firstNumberIsZero() throws Exception {
        assertEquals(0, getNumberAtIndex(0));

    }

    @Test /* for the second number(1) and the index is 1 */
    public void secondNumberIsOne() throws Exception {
        assertEquals(1, getNumberAtIndex(1));
    }

    @Test /* for the third number(1) and the index is 2 */
    public void thirdNumberIsOne() throws Exception {
        assertEquals(1, getNumberAtIndex(2));

    }

    @Test /* for the forth number(2) and the index is 3 */
    public void forthNumberIsTwo() throws Exception {
        assertEquals(2, getNumberAtIndex(3));

    }

    @Test /* for the sixth number(5) and the index is 5 */
    public void sixthNumberIsfive() throws Exception {
        assertEquals(5, getNumberAtIndex(5));

    }

    @Test /* for very huge number */
    public void nextNumberIshuge() {
        assertTrue(getNumberAtIndex(49) > 1000000000);

    }

    /* create a method for get the index */
    public long getNumberAtIndex(int index) {
        new Fibonacci();// create new Fibonacci class
        return Fibonacci.generate(index + 1)[index];
    }

}
