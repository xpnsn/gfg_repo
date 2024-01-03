public class jan2 {

    long maxSumWithK(long a[], long n, long k) {

        long dp[] = new long[(int)n];
        long sum = 0;

        for(int i=0; i<n; i++) {
            sum += a[i];
            dp[i] = sum;
            if(sum < 0) {
                sum = 0;
            }
        }
        sum = 0;
        long maxSum = 0;
        for(int i=0; i<k; i++) {
            sum += a[i];
        }
        maxSum = sum;
        for(int i=(int)k; i<n; i++) {
            sum += a[i];
            sum -= a[i-(int)k];
            if(maxSum < sum) {
                maxSum = sum;
            }
            sum += dp[i - (int)k];
            if(maxSum < sum) {
                maxSum = sum;
            }
            sum -= dp[i - (int)k];
        }

        return maxSum;


    }

    public static void main(String[] args) {
        long a[] = {-4,-1,-1,-1};

        jan2 obj = new jan2();

        System.out.println(obj.maxSumWithK(a, a.length, 2));

    }

}
