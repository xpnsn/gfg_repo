import java.util.Stack;

public class nov10 {
    
    static String printMinNumberForPattern(String S) {
        String ans = "";
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for(int i=0;i<S.length();i++){
            st.push(num);
            num++;
            if(S.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    ans += Integer.toString(st.pop());
                }
            }
        }
        st.push(num);
        while(!st.isEmpty()){
            ans += Integer.toString(st.pop());
        }
        return ans;

    }

    public static void main(String[] args) {
        String S = "IDIDID";
        System.out.println(printMinNumberForPattern(S));
    }
}
