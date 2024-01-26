package hashmap;

import java.util.HashMap;

public class TwoSum {

    public static int[] findTwoSumIndices(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{-1, -1}; // No solution found
    }
}
