package practice.leetcode.problems.p0904fruitintobaskets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitIntoBasketsTest {
    private FruitIntoBaskets solution = new FruitIntoBaskets();

    @Test
    void example1() {
        assertEquals(3, solution.totalFruit(new int[]{1,2,1}));
    }

    @Test
    void example2() {
        assertEquals(3, solution.totalFruit(new int[]{0,1,2,2}));
    }

    @Test
    void example3() {
        assertEquals(4, solution.totalFruit(new int[]{1,2,3,2,2}));
    }

    @Test
    void example4() {
        assertEquals(5, solution.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }
}
