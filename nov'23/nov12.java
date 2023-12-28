public class nov12 {
    
    static boolean isRotated(String str1, String str2) {

        if(str1.length() != str2.length()) return false;

        if((str2.charAt(0) == str1.charAt(str1.length()-2) && str2.charAt(1) == str1.charAt(str1.length()-1))) {
            for(int i=0; i<str1.length()-2; i++) {
                if(str1.charAt(i) != str2.charAt(i+2)) {
                    return false;
                }
            }
        } else if((str1.charAt(0) == str2.charAt(str2.length()-2) && str1.charAt(1) == str2.charAt(str2.length()-1))) {
            for(int i=2; i<str1.length(); i++) {
                if(str1.charAt(i) != str2.charAt(i-2)) return false;
            }
        } else return false;
        return true;
    }

    public static void main(String[] args) {
        
        String str1 = "amazon";
        String str2 = "onazon";

        System.out.println(isRotated(str1, str2));
    }
}
