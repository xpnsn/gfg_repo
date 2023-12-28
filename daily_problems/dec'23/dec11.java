import java.util.ArrayList;

public class dec11 {
    
    static long maximumSumSubarray(int k, ArrayList<Integer> arr, int n) {

        long sum = 0;

        for(int i=0; i<k; i++) {
            sum += arr.get(i);
        }
        int i=k, j=0;

        long maxSum = sum;

        while(i<n) {
            sum += arr.get(i++);
            sum -= arr.get(j++);

            if(sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;

    }

    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);
        arr.add(500);
        arr.add(100);

        System.out.println(maximumSumSubarray(2, arr, arr.size()));

    }

}
