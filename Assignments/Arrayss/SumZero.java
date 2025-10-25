import java.util.Arrays;

public class SumZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(3)));
    }

    static int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            result[index] = i;
            index++;
            result[index] = -i;
            index++;
        }

        if (n % 2 != 0)
            result[index] = 0;
        return result;
    }
}
