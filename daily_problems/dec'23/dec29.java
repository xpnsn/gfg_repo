import java.util.HashSet;

public class dec29 {

    int kSubstrConcate(int n, String s, int k) {

        HashSet<String> map = new HashSet<>();

        if(n % k != 0) return 0;
        String str = "";

        for(int i=0; i<n; i++) {
            str = s.substring(i, i+k);
            i+=k-1;
            map.add(str);
            if(map.size() > 2) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        String s = "abcdabcd";

        dec29 obj = new dec29();
        System.out.println(obj.kSubstrConcate(s.length(), s, 2));
    }

}