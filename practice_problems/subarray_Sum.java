import java.util.ArrayList;

public class subarray_Sum {
    
    static ArrayList<Integer> subarraySum(int arr[], int n, int s) {
        int sum = 0;
        int x=0,y=0;
        ArrayList<Integer> index = new ArrayList<Integer>();
        if(s == 0) {
            index.add(-1);
            return index;
        }
        for(int i=0; i<n; i++) {
            sum += arr[y++];

            while(sum > s) {
                sum -= arr[x++];
            }    

            if(sum == s) {
                break;
            }
        }
        if(sum != s) {
            index.add(-1);
            return index;
        }
        index.add(x+1);
        index.add(y);
        return index;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 3, 5, 2, 1, 2, 5, 6, 7, 4, 8, 9, 2, 3};
        System.out.println(subarraySum(a, 20, 20).toString());
    }
}
