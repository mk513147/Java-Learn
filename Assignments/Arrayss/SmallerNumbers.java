// Q: Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
// Return the answer in an array.

import java.util.Arrays;

public class SmallerNumbers {

    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] res = smallerNumbersThanCurrentOptimal(nums);
        System.out.println(Arrays.toString(res));
    }

    // Brute Force Approach
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (j == i)
                    continue;
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            ans[i] = count;
        }

        return ans;
    }

    // Optimal Approach
    static int[] smallerNumbersThanCurrentOptimal(int[] nums) {
        int[] res = new int[nums.length];
        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        for (int i = 1; i <= 100; i++) {
            freq[i] += freq[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = 0;
            } else {
                res[i] = freq[nums[i] - 1];
            }
        }
        return res;
    }
}