// Q: Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] sumArray = runningSum(nums);
        System.out.println(Arrays.toString(sumArray));
    }

    static int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum[] = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = nums[i] + sum[i - 1];
        }
        return sum;
    }
}