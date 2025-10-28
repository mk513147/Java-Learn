public class Pattern {

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int calcCol = row > n ? 2 * n - row : row;
            for (int col = 0; col < calcCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = row; spaces < n; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int col = row; col < n; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int col = 1; col < row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row; col++) {
                System.out.print("*");
            }
            for (int col = 1; col < n - row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int col = row; col < n; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int calcCol = row >= n ? 2 * n - row - 1 : row;

            for (int spaces = 0; spaces < calcCol; spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col < n - calcCol; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    static void pattern13(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = row; spaces < n; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row - 1; col++) {
                if (col == 0 || col == 2 * row - 2 || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int col = row; col < 2 * n - row - 1; col++) {
                if (col == row || col == 2 * n - row - 2 || row == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern14(5);
    }
}