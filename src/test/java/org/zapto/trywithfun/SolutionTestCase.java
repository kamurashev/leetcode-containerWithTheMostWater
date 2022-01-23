package org.zapto.trywithfun;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTestCase {
    private final SolutionOLogN solution = new SolutionOLogN();
    private final int[] testData = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

    @Test
    public void maxAreaHappyPathTest() {
        assertEquals(49, solution.maxArea(testData));
    }
}
