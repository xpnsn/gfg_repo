import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class findDuplicate {
    
    static ArrayList<Integer> duplicates(int arr[], int n) {

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        hs.add(arr[0]);
        for(int i=1; i<n; i++) {
            if(hs.contains(arr[i])) {
                hs1.add(arr[i]);
            }
            hs.add(arr[i]);
        }

        ArrayList<Integer> dupli = new ArrayList<>(hs1);
        if(dupli.isEmpty()) {
            dupli.add(-1);
        }
        Collections.sort(dupli);
        return dupli;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,9,9,4,4,10,10,5,6,7,7};
        System.out.println(duplicates(arr, arr.length));
    }
}
