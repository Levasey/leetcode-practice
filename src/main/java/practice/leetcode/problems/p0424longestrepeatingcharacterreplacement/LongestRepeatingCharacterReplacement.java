package practice.leetcode.problems.p0424longestrepeatingcharacterreplacement;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int result = 0, left = 0, maxFreq = 0;
        int[] count = new int[26];

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            count[currentChar - 'A']++;
            maxFreq = Math.max(maxFreq, count[currentChar - 'A']);
            while (right - left + 1 - maxFreq > k) {
                char leftChar = s.charAt(left);
                count[leftChar - 'A']--;
                left++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
