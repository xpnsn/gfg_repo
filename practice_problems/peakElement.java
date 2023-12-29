public class peakElement {

    int peakEle(int arr[], int n) {

        int si = 0;
        int ei = n-1;

        int mid;

        int ind = -1;

        while (si <= ei) {
            mid = (si + ei) / 2;
            if(mid == n-1 || mid == 0) break;
            if(arr[mid] >= arr[mid+1] && arr[mid] >= arr[mid-1]) {
                ind = mid;
            }
            if(arr[mid] <= arr[mid+1]) {
                si = mid+1;
            }
            if(arr[mid] >= arr[mid+1]) {
                ei = mid-1;
            }
        }

        if(ind == -1 && arr[0] > arr[1]) return 0;        
        if(ind == -1 && arr[n-1] > arr[n-2]) return n-1;

        return ind;

    }

    public static void main(String[] args) {
        
        int arr[] = {1, 13};

        peakElement obj = new peakElement();

        System.out.println(obj.peakEle(arr, arr.length));
    }
}