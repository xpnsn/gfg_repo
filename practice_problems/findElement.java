import java.util.Arrays;

public class findElement {
    
    static int[] findTwoElement(int arr[], int n) {
        int ans[] = new int[2];
        int b[] = new int[n+1];

        for(int i=0; i<n; i++) {
            if(b[arr[i]] == 0) {
                b[arr[i]] = arr[i];
            } else {
                ans[0] = arr[i];
            }
        }
        System.out.println(Arrays.toString(b));
        for(int i=1; i<=n; i++) {
            if(b[i] == 0) {
                ans[1] = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {12,7,5,1,13,1,10,8,11,9,2,4,3,6};
        System.out.println(Arrays.toString(findTwoElement(arr, arr.length)));
    }
}
