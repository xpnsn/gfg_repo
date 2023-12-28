import java.util.Arrays;

public class zero_one_two {
    
    static void sort012(int arr[], int n) {
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == 1) {
                count1++;
            }
            if(arr[i] == 2) {
                count2++;
            }
        }
        for(int i=n-1; i>=0; i--) {
            if(count2 > 0) {
                arr[i] = 2;
                count2--;
            } else if(count1 > 0) {
                arr[i] = 1;
                count1--;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 2, 0};
        sort012(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
}
 