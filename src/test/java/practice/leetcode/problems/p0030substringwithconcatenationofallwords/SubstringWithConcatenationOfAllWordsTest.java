package practice.leetcode.problems.p0030substringwithconcatenationofallwords;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubstringWithConcatenationOfAllWordsTest {
    private SubstringWithConcatenationOfAllWords solution = new SubstringWithConcatenationOfAllWords();

    @Test
    void example1() {
        List<Integer> actual = solution.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});
        assertEquals(2, actual.size());
        assertTrue(actual.containsAll(List.of(0, 9)));
    }

    @Test
    void example2() {
        List<Integer> actual = solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"});
        assertEquals(0, actual.size());
    }

    @Test
    void example3() {
        List<Integer> actual = solution.findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"});
        assertEquals(3, actual.size());
        assertTrue(actual.containsAll(List.of(6, 9, 12)));
    }
}
