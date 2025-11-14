public class BitwiseOperators {
    public static void main(String[] args) {
        // int num = 23;
        // System.out.println("Is the number ODD: " + isOdd(num));
        int[] nums = { 1, 2, 3, 4, 1, 6, 2, 4, 3 };
        System.out.println("Unique NUmber: " + unique(nums));
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
}
