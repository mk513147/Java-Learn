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

    static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}