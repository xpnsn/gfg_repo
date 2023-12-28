import java.util.ArrayList;
import java.util.HashMap;

public class dec26 {
    
    static ArrayList<ArrayList<Integer>> sumZeroMat(int a[][]) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int len = Integer.MIN_VALUE;
        int sr = 0 ,sc = 0,er = 0,ec = 0;

        for(int i=0; i<a.length; i++) {

            int arr[] = new int[a[i].length];

            for(int j=i; j<a.length; j++) {

                for(int k=0; k<a[i].length; k++) {
                    arr[k] += a[j][k];
                }
                int[] maxlen = maxLen(arr);
                if(len < maxlen[0] && er - sr <= j-i) {
                    sr = i;
                    er = j;
                    sc = maxlen[1] - maxlen[0] + 1;
                    ec = maxlen[1];
                    len = maxlen[0];
                }
                
            }
        }

        if(sr == -1 || sc == -1 || er == -1 || ec == -1) {
            list.add(new ArrayList<>());
            list.get(0).add(-1);

            return list;

        }

        for(int i=sr; i<=er; i++) {

            list.add(new ArrayList<>());
            for(int j=sc; j<=ec; j++) {

                list.get(i-sr).add(a[i][j]);
            }
        }



        return list;
    }

    static int[] maxLen(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 
        int sum = 0;
        int max_len = 0;
        int end_ind = -1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
 
            if (sum == 0) {
                max_len = i + 1;
                end_ind = i;
            }
                
            Integer prev_i = map.get(sum);
            
            if (prev_i != null) {
                max_len = Math.max(max_len, i - prev_i);
                end_ind = i;
            } else {
                map.put(sum, i);
            }
        }

        int pair[] = {max_len,end_ind};
        return pair;
    }

    public static void main(String[] args) {
        int a[][] = {
            {0,5},
            {-8,2},
            {9,-5},
            {0,0}
        };

        System.out.println(sumZeroMat(a));
    }
}
