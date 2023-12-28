public class oct26 {

    static int minOperation(int n) {
        int count=0;
        while(n>0) {
            if(n%2 == 0) {
                n /= 2;
            } else {
                n--;
            }
            count++;
        }
        
        return count;
    }

    public static void main(String args[]) {
        System.out.println("Ans : " + minOperation(1238123));
    }
}
