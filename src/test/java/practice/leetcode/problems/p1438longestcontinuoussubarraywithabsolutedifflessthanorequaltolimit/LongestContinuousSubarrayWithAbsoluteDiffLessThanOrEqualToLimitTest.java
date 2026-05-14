package practice.leetcode.problems.p1438longestcontinuoussubarraywithabsolutedifflessthanorequaltolimit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimitTest {

    private LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit solution =
            new LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit();

    @Test
    void example1() {
        assertEquals(2, solution.longestSubarray(new int[]{8, 2, 4, 7}, 4));
    }

    @Test
    void example2() {
        assertEquals(4, solution.longestSubarray(new int[]{10,1,2,4,7,2}, 5));
    }

    @Test
    void example3() {
        assertEquals(3, solution.longestSubarray(new int[]{4,2,2,2,4,4,2,2}, 0));
    }
}
