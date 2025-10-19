public class MatrixRotationCheck {
    public static void main(String[] args) {
        int[][] mat = { { 0, 1 }, { 1, 0 } };
        int[][] target = { { 1, 0 }, { 0, 1 } };
        System.out.println(findRotation(mat, target));
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target)) {
                return true;
            }

            mat = rotate(mat);
        }
        return false;

    }

    static int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] rotatedArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                rotatedArray[j][n - i - 1] = mat[i][j];
            }
        }

        return rotatedArray;
    }

    static boolean isEqual(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
