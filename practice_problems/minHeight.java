import java.util.Arrays;

public class minHeight {
    
    static int getMinDiff(int arr[], int n, int k) {
     
        Arrays.sort(arr);
        for(int i=0; i<n; i++) {
            if(i > n/2) arr[i] -= k;
            else arr[i] += k;
        }
        Arrays.sort(arr);
        return arr[n-1] - arr[0];
    }

    public static void main(String[] args) {
        int arr[] = {1,8,5,10};
        System.out.println(getMinDiff(arr, arr.length, 2));
    }
}
