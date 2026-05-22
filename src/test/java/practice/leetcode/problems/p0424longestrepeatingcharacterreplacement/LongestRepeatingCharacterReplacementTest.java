package practice.leetcode.problems.p0424longestrepeatingcharacterreplacement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestRepeatingCharacterReplacementTest {
    private LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();

    @Test
    void example1() {
        assertEquals(4, solution.characterReplacement("ABAB", 2));
    }

    @Test
    void example2() {
        assertEquals(4, solution.characterReplacement("AABABBA", 1));
    }

    @Test
    void example3() {
        assertEquals(2, solution.characterReplacement("AABA", 0));
    }
}
