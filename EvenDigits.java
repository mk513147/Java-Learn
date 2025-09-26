public class EvenDigits {
    public static void main(String args[]) {
        int[] arr = { 12, 345, 2, 6, 7896, -6271 ,00};
        int result = findNumbers(arr);
        System.out.println(result);
    }
    
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (even2(n))
                count++;
        }
        return count;
    }
    
    static boolean even(int n) {
        n = Math.abs(n);
        if (n == 0)
            return false;

        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count % 2 == 0;
    }
    static boolean even2(int n) {
        n = Math.abs(n);
        if (n == 0)
            return false;
        // int digits = (int) Math.log10(n<0? -n:n)+1;// This works in all cases
        int digits = (int) Math.log10(n)+1;
        return digits % 2 == 0;
    }
}