// Q: Given two arrays of integers nums and index. Your task is to create target array under the following rules:

// Initially target array is empty.
// From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
// Repeat the previous step until there are no elements to read in nums and index.
// Return the target array.

// It is guaranteed that the insertion operations will be valid.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 }, index = { 0, 1, 2, 2, 1 };
        int[] res = createTargetArray(nums, index);
        System.out.println(Arrays.toString(res));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < target.size(); i++) {
            res[i] = target.get(i);
        }
        return res;
    }
}
