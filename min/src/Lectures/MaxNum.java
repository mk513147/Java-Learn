public class MaxNum {
    public static void main(String args[]) {
        int[][] arr = { { 12, 34, 2, 6, 78 }, { 22, 11, 43 }, { 89, 91, 32} };
        int maxnum = findMax2(arr);
        System.out.println("Max number is: " + maxnum);
    }

    static int findMax(int[][] nums) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] > max) {
                    max = nums[row][col];
                }
            }
        }
        return max;
    }
    static int findMax2(int[][] nums) {
        int max = Integer.MIN_VALUE;
        for (int[] num : nums) {
            for (int n: num) {
                if (n> max) {
                    max = n;
                }
            }
        }
        return max;
    }
}