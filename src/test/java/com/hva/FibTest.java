package com.hva;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FibTest {
    @Test
    public void firstEightNumbersAreCorrect() throws Exception {
        assertArrayEquals(new int[] {0,1,1,2,3,5,8,13}, new fib().generate(8));
        
    }

}
