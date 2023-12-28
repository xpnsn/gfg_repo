public class makeSubstring {

    // static boolean isSubString(String A, String B) {
        
    // }
    
    static int minRepeats(String A, String B) {
        int i=0, j=0;
        int flag = 0;
        int count = 0;

        String temp = A;

        while(j < B.length()) {
            if(flag == 0 && i >= temp.length()) return -1;
            if(i == A.length()) {
                count++;
                A = A + temp;
            }
            if(A.charAt(i) == B.charAt(j)) {
                flag = 1;
                i++;
                j++;
            } else {
                flag = 0;
                i++;
            }
        }
        return count + 1;
    }
    public static void main(String[] args) {
        String A = "ab";
        String B = "cab";
        System.out.println(minRepeats(A, B));
    }
}
