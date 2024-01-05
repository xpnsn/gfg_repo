import java.util.Arrays;

public class rearrangeArray {
    
    static void rearrange(long arr[], int n) {

        long temp1 = arr[0];
        long temp2;
        int len = arr.length;
        for(int i=0; i<n-1; i += 2) {
            
            arr[i] = arr[len - 1];
            temp2 = arr[i+1]; 
            arr[i+1] = temp1;
            temp1 = temp2;
            len--;
        }
    }

    public static void main(String[] args) {
        long arr[] = {1,2,3,4,5,6,7,8,9,10};
        rearrange(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
