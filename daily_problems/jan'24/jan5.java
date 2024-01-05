public class jan5 {
    public int TotalWays(int N) {
        if (N <= 0) {
            return 0;
        } else if (N == 1) {
            return (int) Math.pow(2, 2) % 1000000007;
        } else if (N == 2) {
            return (int) Math.pow(3, 2) % 1000000007; 
        } else {
            int a = 2; 
            int b = 3; 
            int sum = 0;
            for (int i = 3; i <= N; i++) {
                sum = (int) (((long) (a + b) * (a + b)) % 1000000007); // (a + b)^2 % 10^9 + 7 for N > 2
                int temp = (a + b) % 1000000007;
                a = b;
                b = temp;
            }
            return sum;
        }
    }
}
