import java.util.Arrays;

public class nov1 {
    
    static void frequencyCount(int arr[], int n, int p) {
        
        int b[] = new int[n];

        for(int i=0; i<n; i++) {
            if(arr[i] <= n){
                b[arr[i]-1]++;
            }
        }

        for(int i=0; i<n; i++) {
            arr[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,9};
        frequencyCount(arr, arr.length, 9);
        System.out.println(Arrays.toString(arr));
    }
}
