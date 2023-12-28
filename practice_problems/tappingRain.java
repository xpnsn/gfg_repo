public class tappingRain {
    
    static long tappingWater(int arr[], int n) {

        int maxWaterLevel = Math.min(arr[0], arr[n-1]);
        long water = maxWaterLevel * (n-2);
        
        for(int i=1; i<n-1; i++) {
            if(maxWaterLevel >= arr[i]) {
                water -= arr[i];
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int arr[] = {7,4,0,9};
        System.out.println(tappingWater(arr, arr.length));
    }
}
