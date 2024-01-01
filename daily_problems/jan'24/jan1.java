import java.util.HashMap;

public class jan1 {

    boolean canPair(int nums[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        if(nums.length%2 == 1) return false;

        for (int i : nums) {
            int x = i%k;
            if(map.containsKey(x)) {
                map.put(x, map.get(x)+1);
            } else {
                map.put(x, 1);
            }
        }
        for (int i : map.keySet()) {

            if(i == 0 && map.get(i)%2 != 0) {
                return false;
            } else if(i != 0 && (!map.containsKey(k-i) || map.get(i)!=map.get(k-i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = {33,78,45,12,70,40,67,55};
        jan1 obj = new jan1();
        System.out.println(obj.canPair(nums, 10));
    }
}