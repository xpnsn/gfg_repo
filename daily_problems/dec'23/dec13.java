public class dec13 {
    
    static long countString(int n) {
        
        if(n == 1) {
            return 2;
        }
        if(n == 2) {
            return 3;
        }

        long lastSecPrev = 2;
        long prev = 3;
        long curi = 0;

        for(int i=3; i<=n; i++) {
            curi = prev + lastSecPrev;
            lastSecPrev = prev;
            prev = curi;
        }
        return curi; 
    }

    public static void main(String[] args) {
        System.out.println(countString(4));
    }
}
