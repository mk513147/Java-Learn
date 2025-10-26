
import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println("Missing number: " + find(nums));
    }

    static int find(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int originalIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[originalIndex]) {
                swap(nums, i, originalIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }

        return nums.length;

    }

    static List<Integer> findAll(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int originalIndex = nums[i] - 1;
            if (nums[i] != nums[originalIndex]) {
                swap(nums, i, originalIndex);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int originalIndex = nums[i] - 1;
                if (nums[i] != nums[originalIndex]) {
                    swap(nums, i, originalIndex);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    static List<Integer> findAllDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int originalIndex = nums[i] - 1;
            if (nums[i] != nums[originalIndex]) {
                swap(nums, i, originalIndex);
            } else {
                i++;
            }

        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
            }
        }

        return ans;
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int originalIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[originalIndex]) {
                swap(nums, i, originalIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        return nums.length + 1;
    }

    static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

}