// Q:Given an array nums of integers, return how many of them contain an even number of digits
public class CountEvenDigits {

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println("Number of even Digit numbers: " + countEven(nums));
        System.out.println("Number of even Digit numbers: " + countEvenTwo(nums));
    }

    static int countEven(int[] nums) {
        int evenNums = 0;
        for (int num : nums) {
            if (numCount(num) % 2 == 0) {
                evenNums++;
            }
        }
        return evenNums;
    }

    static int countEvenTwo(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (((int) Math.log10(num) + 1) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int numCount(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}