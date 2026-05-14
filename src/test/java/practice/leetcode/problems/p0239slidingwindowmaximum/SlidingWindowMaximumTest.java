package practice.leetcode.problems.p0239slidingwindowmaximum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SlidingWindowMaximumTest {

    private final SlidingWindowMaximum solution = new SlidingWindowMaximum();

    @Test
    void example1() {
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7},
                this.solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
    }

    @Test
    void example2() {
        assertArrayEquals(new int[]{1}, this.solution.maxSlidingWindow(new int[] { 1 }, 1));
    }
}
