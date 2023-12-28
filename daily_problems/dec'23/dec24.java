//time exceed
import java.util.Arrays;
import java.util.Comparator;

public class dec24 {
    
    static int buyMaximumProducts(int n, int k, int[] arr) {

        int count = 0;
        int mat[][] = new int[n][2];
        for(int i =0;i<n;i++){
            mat[i][0] = arr[i];
            mat[i][1] = i+1;
        }
        
        Arrays.sort(mat, Comparator.comparingInt(a -> a[0]));
        
        for(int i =0;i<n;i++){
            if(mat[i][0]*mat[i][1]>k){
                count+=k/mat[i][0];
                break;
            }
            k -= mat[i][0]*mat[i][1];
            count+=mat[i][1];
        }
        
        return count;

    }

    public static void main(String[] args) {
        int price[] = {10, 7, 19};
        System.out.println(buyMaximumProducts(price.length, 45, price));
    }
}
