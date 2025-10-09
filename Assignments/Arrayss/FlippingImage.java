// Q: Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

// To flip an image horizontally means that each row of the image is reversed.

// For example, flipping [1,1,0] horizontally results in [0,1,1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

// For example, inverting [0,1,1] results in [1,0,0].

import java.util.Arrays;

public class FlippingImage {

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        for (int[] row : flipAndInvertImage(image)) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            image[i] = reversed(image[i]);
        }
        return image;
    }

    static int[] reversed(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start] ^ 1;
            arr[start] = arr[end] ^ 1;
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}