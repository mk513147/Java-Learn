import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = { 5, 3, 1, 4, 6, 2 };

        // Make copies of the original array for fair comparison
        int[] arr1 = Arrays.copyOf(nums, nums.length);
        int[] arr2 = Arrays.copyOf(nums, nums.length);
        int[] arr3 = Arrays.copyOf(nums, nums.length);
        int[] arr4 = Arrays.copyOf(nums, nums.length);

        // Bubble Sort
        long start = System.nanoTime();
        bubbleSort(arr1);
        long end = System.nanoTime();
        System.out.println("Bubble Sort: " + Arrays.toString(arr1));
        System.out.println("Time taken (ns): " + (end - start));

        // Selection Sort
        start = System.nanoTime();
        selectionSort(arr2);
        end = System.nanoTime();
        System.out.println("\nSelection Sort: " + Arrays.toString(arr2));
        System.out.println("Time taken (ns): " + (end - start));

        // Insertion Sort
        start = System.nanoTime();
        insertitionSort(arr3);
        end = System.nanoTime();
        System.out.println("\nInsertion Sort: " + Arrays.toString(arr3));
        System.out.println("Time taken (ns): " + (end - start));

        // Cyclic Sort
        start = System.nanoTime();
        cyclicSort(arr4);
        end = System.nanoTime();
        System.out.println("\nCyclic Sort: " + Arrays.toString(arr4));
        System.out.println("Time taken (ns): " + (end - start));
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
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int max = maxIndex(nums, 0, last);
            swap(nums, last, max);
        }
    }

    static void insertitionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }
}
