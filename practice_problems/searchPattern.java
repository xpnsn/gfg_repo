import java.util.ArrayList;

public class searchPattern {
    
    static ArrayList<Integer> search(String pat, String S) {
        ArrayList<Integer> index = new ArrayList<>();
        int j=0;
        int flag = 0;
        int cnt = 0;

        for(int i=0; i<S.length(); i++) {
            if(pat.charAt(j) == S.charAt(i)) {
                flag = 1;
                j++;
                cnt++;
            } else {
                flag = 0;
                j=0;
                cnt = 0;
            }
            if(flag == 1 && cnt == pat.length()) {
                index.add(i+2-pat.length());
                cnt = 0;
                i = i - (j-1);
                j=0;
            }
        }
        if(index.isEmpty())
        index.add(-1);
        
        return index;
    }

    public static void main(String[] args) {
        String pat = "a";
        String S = "aaaaa";
        System.out.println(search(pat, S));
    }
}
