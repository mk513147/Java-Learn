import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    // Brute Force approach
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        if (n == 2 && nums[0] + nums[1] == target)
            return new int[] { 0, 1 };

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { 0, 0 };
    }

    // Optimal Approach
    static int[] twoSumOptimal(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}
