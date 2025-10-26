
interface MountainArray {
    public int get(int index);

    public int length();
}

// Mock implementation of MountainArray for local testing
class MockMountainArray implements MountainArray {
    private int[] arr;

    public MockMountainArray(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}

// Solution class
class Solution {

    // Main function to test the code
    public static void main(String[] args) {
        // Example mountain array: strictly increasing then strictly decreasing
        int[] array = { 1, 2, 4, 5, 3, 1 };
        MountainArray mountainArr = new MockMountainArray(array);

        int target = 3;

        Solution solution = new Solution();
        int index = solution.findInMountainArray(target, mountainArr);

        System.out.println("Target " + target + " found at index: " + index);
    }

    // Finds the target in the mountain array
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = mountainPeak(mountainArr);

        // Check if the peak is the target
        if (mountainArr.get(peak) == target)
            return peak;

        // Search in the left sorted (ascending) part
        int left = search(mountainArr, target, 0, peak - 1, true);
        if (left != -1)
            return left;

        // Search in the right sorted (descending) part
        return search(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    // Function to find the peak of the mountain array
    int mountainPeak(MountainArray arr) {
        int start = 0, end = arr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                // Peak is on the right
                start = mid + 1;
            } else {
                // Peak is at mid or to the left
                end = mid;
            }
        }
        return start; // or end, since they converge
    }

    // Binary search helper method
    int search(MountainArray arr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if (midVal == target)
                return mid;

            if (isAsc) {
                // Ascending order
                if (target < midVal)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                // Descending order
                if (target < midVal)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1; // Target not found
    }
}
