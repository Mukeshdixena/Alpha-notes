package Dynamic_Programming;

public class DP01_fibonacci {

    static int memoization(int n, int dp[]) {
        if (n < 2) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = memoization(n - 1, dp) + memoization(n - 2, dp);
        return dp[n];
    }

    static int tabulation(int n) {
        int dp[] = new int[n + 1];
        dp[1] = 1;// dp[0] = 0;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        
    }
}
