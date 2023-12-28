import java.util.Stack;

public class balanceParenthesis {
    
    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<x.length(); i++) {
            if(x.charAt(i) == '{' || x.charAt(i) == '[' || x.charAt(i) == '(' ) {
                stack.push(x.charAt(i));
            }
            if(x.charAt(i) == '}' || x.charAt(i) == ']' || x.charAt(i) == ')' ) {
                if(stack.isEmpty()){
                    return false;
                }
                switch (stack.peek()) {
                    case '{':
                        if(x.charAt(i) == '}') stack.pop();
                        else return false;
                        break;
                    case '[':
                        if(x.charAt(i) == ']') stack.pop();
                        else return false;
                        break;
                    case '(':
                        if(x.charAt(i) == ')') stack.pop();
                        else return false;
                        break;
                }
                
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        String x = "{[]{]}}";
        System.out.println(ispar(x));
    }
}