public class dec15 {
    
    static int nthPoint(int n) {

        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }

        int lastSecPrev = 1;
        int prev = 2;
        int curi = 0;

        for(int i=3; i<=n; i++) {
            curi = (prev + lastSecPrev) % (1000000007);
            lastSecPrev = prev % (1000000007);
            prev = curi % (1000000007);
        }
        return curi; 
    }

    public static void main(String args[]) {
        System.out.println(nthPoint(5));
    }
}
