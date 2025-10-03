
// Q: Build new array from permutation of a given array

import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] ans = buildArray2(nums);
        System.out.println(Arrays.toString(ans));

    }

    // This method takes O(n) space
    static int[] buildArray(int[] nums) {
        if (nums.length == 0)
            return new int[0];
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    // This will take O(1) space
    static int[] buildArray2(int[] nums) {
        if (nums.length == 0)
            return new int[0];

        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;
    }

}