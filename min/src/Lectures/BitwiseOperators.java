public class BitwiseOperators {
    public static void main(String[] args) {

        // System.out.println("Unique NUmber: " + multipleUnique(nums,
        // numberOfDuplicates));

        // isOdd();
        // unique();
        // magicNumber();
        // numberOfDigits();
        sumOfNthRow();
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
        int ans = (int) (Math.log(num) / Math.log(base)) + 1;
        System.out.println("Number of Digits: " + ans);
    }

    // Pascal's Triangle
    static void sumOfNthRow() {
        int n = 5;
        int sum = 1 << n;// it equals 2^n
        System.out.println("Sum of nth row: " + sum);
    }
}
