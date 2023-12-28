public class nov11 {
    
    static boolean areIsomorphic(String str1, String str2) {

        int cnt = 0;
        if(str1.length() != str2.length()) return false;
        for(int i=0; i<str1.length() - 1; i++) {

            if(str1.charAt(i) == str2.charAt(i)) cnt++;

            if((str1.charAt(i) == str1.charAt(i+1)) &&(str2.charAt(i) == str2.charAt(i+1))) {
                
            } else if ((str1.charAt(i) != str1.charAt(i+1)) &&(str2.charAt(i) != str2.charAt(i+1))) {
                
            } else return false;
            
        }
        if(cnt == 0) return false;
        return true;
    }
    
    public static void main(String[] args) {
        String str1 = "aabk";
        String str2 = "xxyk";
        System.out.println(areIsomorphic(str1, str2));
    }
}
