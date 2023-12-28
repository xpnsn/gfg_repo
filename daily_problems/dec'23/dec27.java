import java.util.Arrays;

public class dec27 {
    
    static int[] antiDiagonalPattern(int[][] matrix) {

        int x;
        int cnt=0;
        int[] pattern = new int[matrix.length * matrix.length];

        for(int i=0; i<matrix.length; i++) {
            x=i;
            for(int j=0; j<=i; j++) {
                pattern[cnt++] = matrix[j][x--];
            }
        }
        for(int i=1; i<matrix.length; i++) {
            x=matrix.length-1;
            for(int j=i; j<matrix.length; j++) {
                pattern[cnt++] = matrix[j][x--];
            }
        }

        return pattern;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(Arrays.toString(antiDiagonalPattern(matrix)));
    }
}
