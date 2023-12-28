import java.util.ArrayList;
import java.util.List;

public class nov6 {
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][]) {

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<q; i++) {
            int col = queries[i][2];
            int row = queries[i][1];
            int val = queries[i][0];
            int sum = 0;
            int cs = col - val, rs = row - val + 1, re = row + val, ce = col + val;

            for(int j=cs; j<=ce && j<m; j++) {
                if(row - val >= 0 && j >= 0 ) {
                    sum += mat[row - val][j];
                }
                if(row + val < n && j >= 0) {
                    sum += mat[row + val][j];
                }
            }
            for(int j=rs; j<re && j<n; j++) {
                if(cs >= 0 && j >= 0) {
                    sum += mat[j][cs];
                }
                if(ce < m && j >= 0) {
                    sum += mat[j][ce];
                }
            }
            list.add(sum);
        }
        return list;
    }

    public static void main(String[] args) {
        int mat[][] = {
            {3,3,9,1,4,6},
            {4,8,3,7,3,5},
            {5,10,8,2,5,5},
            {10,8,9,4,6,6},
            {2,6,10,8,6,3},
            {7,9,7,3,4,8},
            {9,1,3,9,1,3}
            
        };
        int queries[][] = {
            {1,4,5}
        };
        System.out.println(matrixSum(7, 6, mat, 1, queries));
    }
}
