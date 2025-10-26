// Q: Given an array of integers nums, return the number of good pairs.
// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

public class GoodPairs {

    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int res = numIdenticalPairsOptimal(nums);
        System.out.println(res);
    }

    // Brute Force Approach
    static int numIdenticalPairs(int[] nums) {
        int end = nums.length - 1, count = 0;
        for (int i = 0; i <= end; i++) {
            for (int j = end; j > i; j--) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }

        return count;
    }

    // Optimal Approach
    static int numIdenticalPairsOptimal(int[] nums) {
        int count = 0;
        int[] freq = new int[101];
        for (int num : nums) {
            count = count + freq[num];
            freq[num]++;
        }

        return count;
    }

}
