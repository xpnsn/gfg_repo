public class oct29 {
    
    static boolean checkKthBit(int n, int k)
    {
        for(int i=31; i>=0; i--) {
            int x = n >> i; 
            if ((x & 1) > 0 && k == i) {
                return true;
            }
        }
        return false;
    }
     
    public static void main(String[] args) {
        System.out.println(checkKthBit(5, 2));
        // checkKthBit(5, 1);
    }
}
