class Tester {

    public static int cutRod(int[] price, int n) {
        int[] dp = new int[n + 1]; // dp[i] represents the maximum price for a rod of length i

        // Initialize dp array with prices for individual pieces
        for (int i = 1; i <= n; i++) {
            dp[i] = price[i - 1];
        }

        // Compute the maximum price for each rod length
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j] + dp[i - j]);
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int n = 4;

        System.out.println("Maximum price: " + cutRod(price, n));
    }
}
