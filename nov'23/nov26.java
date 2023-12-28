import java.util.ArrayList;
import java.util.List;

public class nov26 {

    static List<Integer> pattern(int n) {

        int x = n;

        List<Integer> list = new ArrayList<>();
        if(n <= 0) {
            list.add(n);
            return list;
        }

        while(x > 0) {
            list.add(x);
            x -= 5;
        }
        while(x <= n) {
            list.add(x);
            x += 5;
        }

        return list;
    }


    public static void main(String[] args) {
        System.out.println(pattern(21));
    }
}
