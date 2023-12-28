import java.util.Arrays;

public class oct31 {
    static void pushZerosToEnd(int arr[], int n) {
        
        int x=0;

        for(int i=0; i<n; i++) {
            if(arr[i] != 0) {
                arr[x++] = arr[i];
            }
        }
        while(x != n) {
            arr[x++] = 0;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,4,0,6,0,1,0,0,5,8,3,4};
        pushZerosToEnd(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
