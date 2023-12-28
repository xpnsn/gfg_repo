import java.util.Arrays;

public class nov25 {
    
    static void shuffleArray(long arr[], int n) {

        int currPos, newPos;
        long currNum, newNum;
        for(int i=1; i<n-1; i++) {
            currNum = arr[i];
            currPos = i;
            while(arr[i] > 0) {
            if(currPos < n/2) {
                newPos = 2*currPos;
            } else {
                newPos = 2*(currPos-n/2) + 1;
            }
            newNum = arr[newPos];
            arr[newPos] = -currNum;
            currNum = newNum;
            
            currPos = newPos;
            }
        }
        
        for(int i=0; i<n; i++) {
            if(arr[i] < 0) {
                arr[i] *= -1;
            }
        }
        System.err.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        long arr[] = {5,9,7,7,9,6,8,9,10,1};
        shuffleArray(arr, arr.length);
    }
}
