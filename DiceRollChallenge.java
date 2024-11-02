public class DiceRollChallenge {

    public static int numberOfWays(int N, int M, int X) {
        int[] dp = new int[X + 1];
        dp[0] = 1;

        for (int i = 1; i <= N; i++) {
            int[] temp = new int[X + 1];
            for (int j = 1; j <= X; j++) {
                for (int k = 1; k <= M && k <= j; k++) {
                    temp[j] += dp[j - k];
                }
            }
            dp = temp;
        }

        return dp[X];
    }

    public static void main(String[] args) {
        System.out.println(numberOfWays(6, 3, 12)); // Output
    }
}
