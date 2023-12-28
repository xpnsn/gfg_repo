import java.util.Arrays;

public class transposeMatrix {
    static void transpose(int n,int a[][])
    {
        int temp;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(a));
        // System.out.println(Arrays.deepToString(b));        
    }

    public static void main(String[] args) {
        int a[][] = {
            {1,1,1,1},
            {2,2,2,2},
            {3,3,3,3},
            {4,4,4,4}
        };
        transpose(4, a);
    }
}