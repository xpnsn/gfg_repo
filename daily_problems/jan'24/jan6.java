public class jan6 {
    public static long sumOfPowers(long a, long b) {
        long sumPow = 0;
        for(long i=a; i<=b; i++) {
            sumPow += powerSum(i);
        }
        return sumPow;
    }

    static long powerSum(long n) {

        long sum = 0;
        for(long i=2; i*i<=n; i++) {
            
            while (n%i == 0) {
                sum++;
                n /= i;
            }
        }
        if(n > 1) {
            sum++;
        }
        return sum;
    }
    public static void main(String[] args) {

        System.out.println(sumOfPowers(9, 12));
    }
}