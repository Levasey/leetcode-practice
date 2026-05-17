package practice.leetcode.problems.p1004maxconsecutiveonesiii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesIiiTest {
    private MaxConsecutiveOnesIii solution = new MaxConsecutiveOnesIii();

    @Test
    void example1() {
        assertEquals(6, solution.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }

    @Test
    void example2() {
        assertEquals(10, solution.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }
}
