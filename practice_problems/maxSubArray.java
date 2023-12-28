import java.util.ArrayList;

public class maxSubArray {

    static ArrayList<Integer> maxArray(int arr[], int n, int k) {
        ArrayList<Integer> maxEle = new ArrayList<Integer>();

        int max = arr[0];
        int temp = 0, x = 0;
        for(int i=1; i<k; i++) {
            if(max < arr[i]) {
                max = arr[i];
                temp = i;
            }
        }
        maxEle.add(max);

        for(int i=k; i<n; i++) {

            if(temp > x) {
                if(max <= arr[i]) {
                    max = arr[i];
                    maxEle.add(max);
                    temp = i;
                } 
                else {
                    maxEle.add(max);
                }
            }
            if(temp == x) {
                max = arr[i-k+1];
                for(int j=i-k+1; j<=i; j++) {
                    if(max <= arr[j]) {
                        max = arr[j];
                        temp = j;
                    }
                }
                maxEle.add(max);
            }
            x++;
        }

        return maxEle;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,4,3,7,8,4,6,6,3,2,7,9,3};
        System.out.println(maxArray(arr, arr.length, 3));
    }
}