public class oct28 {

    static int is_bleak_newAlgo(int n)
    {
        for(int i=1; i<=30; i++) {
            int rem = n-i;
            if(rem < 0) {
                break;
            }
            int cnt = countBits(rem);
            if(cnt == i) {
                return 0;
            }
        }
        return 1;
    }

    static int is_bleak(int n) {
        int n1=n;
        while(n1>0) {
            if(n1 + countBits(n1) == n) {
                return 0;
            }
            // System.out.println(n1 + countBits(n1));
            n1--;
        }
        return 1;
        
    }

    static int countBits(int n) {
        int count=0;

        while(n>0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        for(int i=1; i<=60; i++) {
            System.out.print(" "+countBits(i));
        }
        // System.out.print(is_bleak_newAlgo(100));
        // is_bleak(100);
    }
}
