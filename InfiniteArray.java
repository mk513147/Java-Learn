public class InfiniteArray {

    public static void main(String args[]) {
        int[] nums = { 12, 18, 37, 48, 59, 61, 72, 89, 97, 101, 112, 123, 129, 135, 140, 147, 155, 169, 178, 184, 190,
                203, 215, 224, 228, 245, 251, 259, 260, 274, 281, 291, 300, 318, 324, 339, 351, 362, 377, 381, 394, 408,
                415, 430, 447, 460, 472, 490, 495, 499 };// Think this as of an infinite array meaning its length is
                                                         // unkown so we cannot use length property.
        int target = 259;
        System.out.println("Target found at index: " + ans(nums, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0, end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}