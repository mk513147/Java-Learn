import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {

    }

    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            int minVal = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    colIndex = j;
                }
            }

            if (checkMax(matrix, colIndex, minVal)) {
                result.add(minVal);
            }

        }
        return result;
    }

    static boolean checkMax(int[][] arr, int col, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] > num) {
                return false;
            }
        }
        return true;
    }

}
