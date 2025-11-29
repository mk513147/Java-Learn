public class BitwiseOperators {
    public static void main(String[] args) {
        // int num = 23;
        // System.out.println("Is the number ODD: " + isOdd(num));

        // int[] nums = { 1, 1, 2, 2, 3, 3, 4, 4, 1, 6, 2, 4, 3 };
        // int numberOfDuplicates = 3;
        // System.out.println("Unique NUmber: " + multipleUnique(nums,
        // numberOfDuplicates));

        int num = 6;
        System.out.println("Magic Number: " + magicNumber(num));
    }

    static boolean isOdd(int num) {
        return (num & 1) == 1;
    }

    static int unique(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
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

    static int magicNumber(int num) {
        int ans = 0;
        int base = 5;
        while (num > 0) {
            int last = num & 1;
            ans += last * base;
            base *= 5;
            num = num >> 1;

        }
        return ans;
    }
}
