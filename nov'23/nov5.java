import java.util.*;

public class nov5 {
    
    static void topk(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i : arr) {
            if(map.containsKey(i)) map.put(i, map.get(i)+1);
            else map.put(i, 1);
        }

        List< HashMap.Entry<Integer, Integer> > list = new ArrayList<>(map.entrySet());
        
        Comparator<Map.Entry<Integer, Integer>> compare = (entry1, entry2) -> {
            int valueCompare = entry2.getValue().compareTo(entry1.getValue());
            if(valueCompare == 0) {
                return entry2.getKey().compareTo(entry1.getKey());
            }
            return valueCompare;
        };

        list.sort(compare);
        System.out.println(list);
        
        int ans[] = new int[k];

        for(int i=k-1; i>=0; i--) {
            ans[i] = list.get(i).getKey();
        }

        System.out.println(Arrays.toString(ans));

    }

    public static void main(String[] args) {
        int arr[] = {6,1,1,1,2,2,3};
        topk(arr, 2);
    }
}
