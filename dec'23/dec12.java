public class dec12 {
    
    static int maxGold(int n, int m, int M[][]) {

        int dp[][] = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                dp[i][j] = -1;
            }
        }
        int gold = dig(0, 0, n, m, M, dp);
        for(int i=1; i<n; i++) {
            if(gold < dig(i, 0, n, m, M, dp)) gold = dig(i, 0, n, m, M, dp);
        }
        return gold;
    }

    static int dig(int i, int j, int n, int m, int M[][], int dp[][]) {

        if(j == m || i == -1 || i == n) return 0;

        if(dp[i][j] > -1) {
            return dp[i][j];
        }
        
        int sum1 =  M[i][j] + dig(i-1, j+1, n, m, M, dp);
        int sum2 =  M[i][j] + dig(i, j+1, n, m, M, dp);
        int sum3 =  M[i][j] + dig(i+1, j+1, n, m, M, dp);

        int maxSum =  Math.max(sum1, Math.max(sum2, sum3));
        dp[i][j] = maxSum;
        return dp[i][j];
    }

    public static void main(String args[]) {
        int M[][] = {
            {1,3,1,5},
            {2,2,4,1},
            {5,0,2,3},
            {0,6,1,2}
        };

        System.out.println(maxGold(4, 4, M));
    }
}
