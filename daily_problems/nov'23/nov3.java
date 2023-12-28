public class nov3 {
    
    static boolean checkTriplet(int arr[], int n) {
        int x,y,z;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    x=arr[i]*arr[i];
                    y=arr[j]*arr[j];
                    z=arr[k]*arr[k];
                    if(z == x + y) {
                        return true;
                    }
                    if(y == z + x) {
                        return true;
                    }
                    if(x == z + y) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4,6,5};
        System.out.println(checkTriplet(arr, arr.length));
    }
}
