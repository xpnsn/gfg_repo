public class nov2 {
    
    static int minDist(int arr[], int n, int x, int y) {
        int a=-1, b=-1;
        int dist = n-1;
        for(int i=0; i<n; i++) {
            if(arr[i] == x) {
                a = i;
            } 
            if(arr[i] == y) {
                b = i;
            }
            if(dist > Math.abs(a-b) && a != -1 && b != -1) {
                dist = Math.abs(a-b);
            }
        }
        if(a == -1 || b == -1) {
            return -1;
        }
        return dist;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,6,2,7,1,8,9,2,1};
        System.out.println(minDist(arr, arr.length, 2, 1));
    }
}
