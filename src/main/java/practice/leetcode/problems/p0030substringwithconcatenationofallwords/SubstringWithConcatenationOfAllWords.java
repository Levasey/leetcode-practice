package practice.leetcode.problems.p0030substringwithconcatenationofallwords;

import java.util.*;


public class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int wordLen = words[0].length();
        Map<String, Integer> required = new HashMap<>();

        for (String word : words) {
            required.put(word, required.getOrDefault(word, 0) + 1);
        }

        for (int start = 0; start < wordLen; start++) {
            Map<String, Integer> found = new HashMap<>();
            int formed = 0;
            int left = start;
            for (int right = start; right < s.length(); right += wordLen) {
                if (right + wordLen > s.length()) break;
                String word = s.substring(right, right + wordLen);
                if (!required.containsKey(word)) {
                    found = new HashMap<>();
                    formed = 0;
                    left = right + wordLen;
                    continue;
                }

                int currentCount = found.getOrDefault(word, 0);
                int newCount = currentCount + 1;
                found.put(word, newCount);

                if (newCount == required.get(word)) {
                    formed++;
                }

                while (found.get(word) > required.get(word)) {
                    String leftWord = s.substring(left, left + wordLen);

                    int leftCount = found.get(leftWord);
                    if (leftCount == required.get(leftWord)) formed--;
                    found.put(leftWord, leftCount - 1);
                    left += wordLen;
                }

                if (formed == required.size() && (right - left) / wordLen + 1 == words.length) {
                    result.add(left);
                    String leftWord = s.substring(left, left + wordLen);
                    int leftCount = found.get(leftWord);
                    if (leftCount == required.get(leftWord)) formed--;
                    found.put(leftWord, leftCount - 1);
                    left += wordLen;
                }
            }
        }
        return result;
    }
}
