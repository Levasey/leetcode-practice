package practice.leetcode.problems.p2461maximumsumofdistinctsubarrayswithlengthk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumOfDistinctSubarraysWithLengthKTest {
    private MaximumSumOfDistinctSubarraysWithLengthK solution = new MaximumSumOfDistinctSubarraysWithLengthK();

    @Test
    void example1() {
        assertEquals(15, solution.maximumSubarraySum(new int[]{1, 5, 4, 2, 9, 9, 9}, 3));
    }

    @Test
    void example2() {
        assertEquals(0, solution.maximumSubarraySum(new int[]{4, 4, 4}, 3));
    }
}
