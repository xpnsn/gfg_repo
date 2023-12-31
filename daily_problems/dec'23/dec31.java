public class dec31 {
    
    static boolean isPossible(int N, int[] coins) {
        
        Boolean dp[][] = new Boolean[N][2025];

        return helper(dp, coins, 0, 0);
    }

    static boolean helper(Boolean[][] dp, int coins[], int i, int j) {
        if(i == dp.length) {
            if ((j%20 == 0 || j%24 == 0 || j == 2024) && j>0) {
                return true;
            } else {
                return false;
            }
        }
        if(dp[i][j] != null) return dp[i][j];

        Boolean take = null, notTake =null;

        notTake = helper(dp, coins, i+1, j);

        if((j + coins[i]) < 2025) {
            take = helper(dp, coins, i+1, j+coins[i]);
        }
        return dp[i][j] = take || notTake;
    }

    public static void main(String[] args) {
        int coins[] = {18, 1, 16, 17};
        System.out.println(isPossible(coins.length, coins));
    }
}
