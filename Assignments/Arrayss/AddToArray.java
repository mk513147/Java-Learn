// The array-form of an integer num is an array representing its digits in left to right order.

// For example, for num = 1321, the array form is [1,3,2,1].
// Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

import java.util.LinkedList;
import java.util.List;

public class AddToArray {

    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 0 };
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<>();
        int i = num.length - 1;
        int carry = k;

        while (i >= 0 || carry > 0) {
            if (i >= 0) {
                carry += num[i];
                i--;
            }
            result.addFirst(carry % 10);
            carry /= 10;
        }

        return result;
    }
}