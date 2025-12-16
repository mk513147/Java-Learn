import java.util.*;

public class BitwiseOperators {
    public static void main(String[] args) {

        // System.out.println("Unique NUmber: " + multipleUnique(nums,
        // numberOfDuplicates));

        // isOdd();
        // unique();
        // magicNumber();
        // numberOfDigits();
        // sumOfNthRow();
        // isPowerOfTwo();
        // powerOfNumber();
        // setBits();
        System.out.println("Xor: " + rangeXor(2, 4));
    }

    static void isOdd() {
        System.out.println("Is the number ODD: " + ((24 & 1) == 1));
    }

    static void unique() {
        int[] nums = { 1, 1, 2, 2, 3, 3, 4, 4, 1, 6, 2, 4, 3 };
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        System.out.println("Unique Number: " + xor);
    }

    // TDOD:
    static int multipleUnique(int[] nums, int n) {
        {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % n != 0) {
                    return nums[i];
                }
            }
            return -1;
        }

    }

    static void magicNumber() {
        int num = 6;
        int ans = 0;
        int base = 5;
        while (num > 0) {
            int last = num & 1;
            ans += last * base;
            base *= 5;
            num = num >> 1;

        }
        System.out.println("Magic Number: " + ans);
    }

    static void numberOfDigits() {
        int num = 10;
        int base = 2;
        // log(base)(num) = log(num)/log(base)
        int ans = (int) (Math.log((double) num) / Math.log((double) base)) + 1;

        System.out.println("Number of Digits: " + ans);
    }

    // Pascal's Triangle
    static void sumOfNthRow() {
        int n = 5;
        int sum = 1 << n;// it equals 2^n
        System.out.println("Sum of nth row: " + sum);
    }

    static void isPowerOfTwo() {
        int n = 17;
        if (n == 0) {
            System.out.println("Is Power: " + false);
            return;
        }
        boolean ans = (n & (n - 1)) == 0;
        System.out.println("Is Power: " + ans);

    }

    static void powerOfNumber() {
        int base = 3;
        int power = 6;

        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            power = power >> 1;
            base *= base;
        }
        System.out.println("Answer: " + ans);
    }

    static void setBits() {
        int n = 10;
        System.out.println(Integer.toBinaryString(n));
        int count = 0;
        // while (n > 0) {
        // count++;
        // n -= (n & (-n));
        // }
        while (n > 0) {
            count++;
            n = (n & (n - 1));
        }
        System.out.println("Number of set Bits: " + count);
    }

    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }
        return 0;
    }

    static int rangeXor(int a, int b) {
        return xor(b) ^ xor(a - 1);
    }
}
