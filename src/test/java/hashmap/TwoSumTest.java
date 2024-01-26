package hashmap;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testFindTwoSumIndices() {
        int[] nums = {10, 20, 30, 40, 50, 60};

        // Test Case 1: Valid input with a solution
        int target1 = 100;
        int[] expected1 = {3, 5};
        assertArrayEquals(expected1, TwoSum.findTwoSumIndices(nums, target1));

        // Test Case 2: Valid input with no solution
        int target2 = 200;
        int[] expected2 = {-1, -1};
        assertArrayEquals(expected2, TwoSum.findTwoSumIndices(nums, target2));

        // Test Case 3: Empty array
        int[] emptyArray = {};
        int target3 = 10;
        int[] expected3 = {-1, -1};
        assertArrayEquals(expected3, TwoSum.findTwoSumIndices(emptyArray, target3));
    }
}
