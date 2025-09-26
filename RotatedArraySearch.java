public class RotatedArraySearch {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        Solution sol = new Solution();
        int result = sol.search(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int maxNum = pivot(nums);

        // Case 1: Array is not rotated
        if (maxNum == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Case 2: Target is at the pivot
        if (nums[maxNum] == target) {
            return maxNum;
        }

        // Case 3: Target lies in the left sorted portion
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, maxNum - 1);
        }

        // Case 4: Target lies in the right sorted portion
        return binarySearch(nums, target, maxNum + 1, nums.length - 1);
    }

    // Method to find the pivot (index of the maximum element)
    int pivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Pivot condition: mid element > next element
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Pivot condition: mid element < previous element
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // Method to find the pivot (index of the maximum element) in array with
    // duplicate elements
    int pivotWithDuplicates(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Pivot condition: mid element > next element
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Pivot condition: mid element < previous element
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            // if start and end are same move ahead one element
            if (arr[start] == arr[end] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // Here we check for the second last element for the pivot because if the pivot
                // is at the end it is already an sorted array
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
