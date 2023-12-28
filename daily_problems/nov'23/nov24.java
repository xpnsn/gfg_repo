import java.util.ArrayList;

public class nov24 {
    
    static ArrayList<Long> nthRowPascal(int n) {

        ArrayList<Long> list = new ArrayList<>();

        long[][] arr = new long[n][n];

        for(int i=0; i<n; i++) {

            arr[i][0] = 1;
            arr[i][i] = 1;
            for(int j=1; j<i; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        for(int i=0; i<n; i++) {
            list.add(arr[n-1][i]);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(nthRowPascal(1));
    }
}
