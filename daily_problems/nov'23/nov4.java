public class nov4 {
    
    static int transitionPoint(int arr[], int n) {

        int si=0;
        int ei = arr.length - 1;

        
        while (si <= ei) {
            
            int mid = si + (ei - si)/2;
            
            if(arr[ei] == 0) {
                return -1;
            }
            if(arr[si] == 1) {
                return 0;
            }
            if(arr[mid] == 0 && arr[mid + 1] == 1) {
                return mid+1;
            }
            if(arr[mid] == 0 && arr[mid + 1] != 1) {
                si = mid + 1;
            }
            if(arr[mid] == 1 && arr[mid - 1] == 0) {
                return mid;
            }
            if(arr[mid] == 1 && arr[mid] != 0) {
                ei = mid - 1;
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
        System.out.println(transitionPoint(arr, arr.length));
    }

}
