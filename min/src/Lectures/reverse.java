import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        String str = "Hello World";
        int[] arr = { 1, 2, 3, 4, 5 };
        reverseArray(arr);
        System.out.println("Array reversed: " + Arrays.toString(arr));
        String reversed = reverseString(str);
        System.out.println("String reversed: " + reversed);
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (end > start) {
            swap(charArray, start, end);
            start++;
            end--;
        }
        return new String(charArray);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}
