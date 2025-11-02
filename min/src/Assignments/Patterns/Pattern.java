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

    static void pattern15(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int calRow = row >= n ? row - n : n - row;
            for (int spaces = 0; spaces < calRow; spaces++) {
                System.out.print(" ");
            }
            int calcCol = row >= n ? 2 * (2 * n - row) - 1 : 2 * row - 1;
            for (int col = 0; col < calcCol; col++) {
                if (col == 0 || col == calcCol - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    static void pattern16(int n) {
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(num + " ");
                num = num * (row - col) / (col + 1);
            }

            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int calRow = row >= n ? row - n : n - row;
            for (int spaces = 0; spaces < calRow; spaces++) {
                System.out.print(" ");
            }
            int calcCol = row >= n ? 2 * n - row : row;
            for (int col = calcCol; col >= 1; col--) {
                System.out.print(col);

            }
            for (int col = 1; col < calcCol; col++) {
                System.out.print(col + 1);

            }

            System.out.println();
        }
    }

    static void pattern18(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int calcCol = row >= n ? row + 1 - n : n - row;
            for (int col = 0; col < calcCol; col++) {
                System.out.print("*");

            }

            int calcSpace = row >= n ? 2 * n - row - 1 : row;
            for (int spaces = 1; spaces <= calcSpace; spaces++) {
                System.out.print(" ");
            }

            for (int spaces = 0; spaces < calcSpace; spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col < calcCol; col++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

    static void pattern19(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int calcCol = row >= n ? 2 * n - row : row;
            for (int col = 0; col < calcCol; col++) {
                System.out.print("*");

            }

            int calcSpace = row >= n ? row - n : n - row;
            for (int spaces = 0; spaces < calcSpace; spaces++) {
                System.out.print(" ");
            }
            for (int spaces = 0; spaces < calcSpace; spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col < calcCol; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern20(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < n - 1; col++) {
                if (col == 0 || col == n - 2 || row == 1 || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    static void pattern21(int n) {
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }

    static void pattern22(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                if (row % 2 == 0) {
                    if (col % 2 != 0) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                } else {
                    if (col % 2 == 0) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void pattern23(int n) {
        for (int row = 1; row < n; row++) {
            for (int space = row; space < n; space++) {
                System.out.print("  ");
            }

            for (int col = 0; col < row; col++) {
                if (col == 0 || col == row - 1) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }

            for (int space = 0; space < n - row - 1; space++) {
                System.out.print("  ");
            }

            for (int col = 0; col < row; col++) {
                if (row == n - 1 && col == 0) {
                    System.out.print("  ");
                } else if (col == 0 || col == row - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }

    static void pattern24(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int calcCol = row >= n ? 2 * n - row : row;
            for (int col = 0; col < calcCol; col++) {
                if (col == 0 || col == calcCol - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            int calcSpace = row >= n ? row - n : n - row;
            for (int spaces = 0; spaces < calcSpace; spaces++) {
                System.out.print(" ");
            }
            for (int spaces = 0; spaces < calcSpace; spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col < calcCol; col++) {
                if (col == 0 || col == calcCol - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    static void pattern25(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col < n; col++) {
                if (col == 0 || col == n - 1 || row == 1 || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    static void pattern26(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col <= n - row; col++) {
                System.out.print(row);
            }

            System.out.println();
        }
    }

    static void pattern27(int n) {
        int num1 = 1;
        int num2 = n * n + 1;
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < n - row; col++) {
                System.out.print(num1 + "  ");
                num1++;
            }

            int temp = num2;
            for (int col = 0; col < n - row; col++) {
                System.out.print(temp + "  ");
                temp++;
            }
            num2 = num2 - (n - row - 1);
            System.out.println();
        }

    }

    static void pattern28(int n) {

        for (int row = 1; row < 2 * n; row++) {
            int calRow = row >= n ? row - n : n - row;
            for (int spaces = 0; spaces < calRow; spaces++) {
                System.out.print(" ");
            }
            int calcCol = row > n ? 2 * n - row : row;
            for (int col = 0; col < calcCol; col++) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }

    static void pattern29(int n) {
        pattern19(n);
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 1; col < row; col++) {
                System.out.print(col + 1);
            }

            System.out.println();
        }
    }

    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern32(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col > 0; col--) {
                char ch = (char) (70 - col);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern33(int n) {
        int num = 97;
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                char ch = num % 2 == 0 ? Character.toUpperCase((char) num) : (char) num;
                System.out.print(ch + " ");
                num++;
            }
            System.out.println();
        }
    }

    static void pattern34(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = n - row; col > 0; col--) {
                char ch = (char) (65 + col - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern35(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            for (int space = 0; space < 2 * (n - row); space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern35(9);
    }
}