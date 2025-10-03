
// Q: Given an integer array nums of length n, you want to create an array ans
// of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
// (0-indexed).

import java.util.Arrays;

public class Concatination {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        int[] concatinatedArray = getConcatenation(nums);
        System.out.println(Arrays.toString(concatinatedArray));
    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        if (nums.length == 0)
            return new int[0];

        int[] ans = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            ans[i] = nums[i % n];
        }
        return ans;
    }

    static int[] getConcatenation2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}