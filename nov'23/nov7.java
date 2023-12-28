import java.util.ArrayList;

public class nov7 {
    
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {

        ArrayList<Integer> sum = new ArrayList<>();
        int sumL = 0, sumU = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!(j < i)) {
                    sumU += matrix[i][j];
                }
                if(!(i < j)) {
                    sumL += matrix[i][j];
                }
            }
        }
        sum.add(sumU);
        sum.add(sumL);

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {6,5,4},
            {1,2,5},
            {7,9,7}
        };
        System.out.println(sumTriangles(matrix, matrix.length));
    }
}
