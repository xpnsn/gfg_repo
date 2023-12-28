public class nov9 {
    
    static int columnWithMaxZeros(int arr[][], int n) {

        int cnt = 0, maxCnt = 0;
        int maxCol = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(arr[j][i] == 0) {
                    cnt++;
                }
            }
            if(maxCnt < cnt) {
                maxCol = i;
                maxCnt = cnt;
            }
            cnt = 0;
        }
        if(maxCnt == 0) return -1;
        return maxCol;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {0,0,0,1},
            {1,0,1,0},
            {0,1,1,0},
            {1,1,1,0}
        };
        System.out.println(columnWithMaxZeros(arr, arr.length));
    }
}
