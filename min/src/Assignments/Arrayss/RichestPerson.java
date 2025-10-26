// Q: You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

public class RichestPerson {

    public static void main(String[] args) {

        int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        int maxNum = maximumWealth(accounts);
        System.out.println("Maximum Wealth: " + maxNum);

    }

    static int maximumWealth(int[][] accounts) {
        int maxi = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            maxi = Math.max(maxi, sum);
        }
        return maxi;
    }
}