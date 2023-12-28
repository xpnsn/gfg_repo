public class nov14 {
    
    static boolean areRotated(String s1, String s2) {

        return (s1+s1).contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        System.out.println(areRotated(s1, s2));
    }
}
