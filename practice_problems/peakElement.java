public class peakElement {

    int peakEle(int arr[], int n) {

        int si = 1;
        int ei = n-2;

        while(si<n-1 && ei>0) {
            if(arr[si] >= arr[si-1] && arr[si] <= arr[si+1]) return si;            
            if(arr[ei] >= arr[si-1] && arr[ei] <= arr[ei+1]) return ei;
            si++;
            ei--;

        }

        if(arr[0] > arr[1]) return 0;        
        if(arr[n-1] > arr[n-2]) return n-1;

        return -1;

    }

    public static void main(String[] args) {
        
        int arr[] = {1, 13, 24, 10};

        peakElement obj = new peakElement();

        System.out.println(obj.peakEle(arr, arr.length));
    }
}