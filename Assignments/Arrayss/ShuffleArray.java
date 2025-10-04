// Q: Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            // res[j++] = nums[i];
            // res[j++] = nums[n + i];
            res[j] = nums[i];
            j++;

            res[j] = nums[i + n];
            j++;
        }
        return res;
    }
}