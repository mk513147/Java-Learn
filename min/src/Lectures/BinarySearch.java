public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 6;
        System.out.println("Element found at index: " + recursiveBinarySearch(arr, target, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    static int recursiveBinarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            return recursiveBinarySearch(arr, target, mid + 1, end);
        }
        return recursiveBinarySearch(arr, target, start, mid - 1);
    }
}