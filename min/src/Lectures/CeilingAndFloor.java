public class CeilingAndFloor {
    public static void main(String args[]) {
        int[] arr = { 2, 4, 5, 9, 14, 15, 16, 18 };
        int target = 15;
        int ceil = ceiling(arr, target);
        int flo = floor(arr, target);
        System.out.println("Ceil: " + arr[ceil]);
        System.out.println("Floor: " + arr[flo]);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if (target == arr[end])
            return -1;
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
        return start;
    }

    static int floor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
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
        return end;
    }
}