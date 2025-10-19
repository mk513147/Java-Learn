import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = { 5, 3, 1, 4, 6, 2 };
        // bubbleSort(nums);
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void bubbleSort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, i, j);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }

        }
    }

    static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int max = maxIndex(nums, 0, last);
            swap(nums, last, max);
        }
    }
}
