import java.util.HashSet;

public class dec10 {
    
    static boolean zeroSum(int arr[], int n) {
        
        HashSet<Integer> hash = new HashSet<>();

        int sum = 0;
        for(int i : arr) {
            sum += i;
            if(sum == 0 || i == 0 || hash.contains(sum)) return true;
            hash.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {10, 10, 1, 10, 1, -5, -6, 10};

        System.out.println(zeroSum(arr, arr.length));
    }
}
