public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 6;
        System.out.println("Element found at index: " + binarySearch(arr, target));
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
}