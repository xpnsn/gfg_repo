import java.util.Arrays;

public class minPlatforms {
    
    int findPlatforms(int arr[], int dep[], int n) {

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=0, j=0; 
        int cnt = 0, ans = 0;
        while(i < n) {
            if(arr[i] <= dep[j]) {
                cnt++;
                i++;
                ans = Math.max(cnt, ans);
            } else {
                cnt--;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        minPlatforms obj = new minPlatforms();

        System.out.println(obj.findPlatforms(arr, dep, arr.length));
    }
}
