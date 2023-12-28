import java.util.ArrayList;

public class nov8 {
    
    static ArrayList<Integer> snakePattern (int arr[][], int n) {

        ArrayList<Integer> snake = new ArrayList<>();

        for(int i=0; i<n; i++) {
            if(i%2 == 0) {
                for(int j : arr[i]) {
                    snake.add(j);
                }
            } else {
                for(int j=n-1; j>=0; j--) {
                    snake.add(arr[i][j]);
                }
            }
        }
        return snake;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(snakePattern(arr, arr.length));
    }
}
