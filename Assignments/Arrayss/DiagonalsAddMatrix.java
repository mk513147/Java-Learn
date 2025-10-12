
public class DiagonalsAddMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Sum of Diagonals: " + diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

        // Subtract the mid element as in odd matrix the mid element gets added twice.
        if (mat.length % 2 != 0) {
            sum = sum - mat[n / 2][n / 2];
        }
        return sum;
    }
}
