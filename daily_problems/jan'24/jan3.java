public class jan3 {
    public int smallestSubstring(String S) {
        int zero = -1;
        int one = -1;
        int two = -1;
        
        int len = -1;
        int minLen = Integer.MAX_VALUE;
        
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '0') 
                zero = i;
            if(S.charAt(i) == '1')
                one = i;
            if(S.charAt(i) == '2')
                two = i;
                
            if(zero!=-1 && one!=-1 && two!=-1) {
                len = i - Math.min(zero, Math.min(one, two)) + 1;
                if(len < minLen) {
                    minLen = len;
                }
            }
        }
        if(len == -1) return -1;
        return minLen;
        
    }
    
}

