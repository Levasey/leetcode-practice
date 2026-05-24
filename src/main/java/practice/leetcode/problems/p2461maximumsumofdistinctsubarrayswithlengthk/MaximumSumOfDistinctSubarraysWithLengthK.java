package practice.leetcode.problems.p2461maximumsumofdistinctsubarrayswithlengthk;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumOfDistinctSubarraysWithLengthK {
    public long maximumSubarraySum(int[] nums, int k) {
        long result = 0;
        long windowSum = 0;
        int left = 0;
        Map<Integer, Integer> window = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            int currentNumber = nums[right];
            windowSum += currentNumber;
            window.put(currentNumber, window.getOrDefault(currentNumber, 0) + 1);

            while (window.get(currentNumber) > 1) {
                int leftNumber = nums[left];
                window.put(leftNumber, window.getOrDefault(leftNumber, 0) - 1);
                if (window.get(leftNumber) == 0) window.remove(leftNumber);
                windowSum -= leftNumber;
                left++;
            }

            if (window.size() == k) {
                result = Math.max(result, windowSum);
                int leftNumber = nums[left];
                window.remove(leftNumber);
                windowSum -= leftNumber;
                left++;
            }
        }
        return result;
    }
}
