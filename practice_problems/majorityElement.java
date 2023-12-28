public class majorityElement {
    
    static int majorEle(int a[], int n) {
        int count=0, ele = 0;

        for(int i=0; i<n; i++) {

            if(count == 0) {
                ele = a[i];
                count = 1;
            } else if (a[i] == ele) {
                count++;
            } else {
                count--;
            }
        }
        int cnt = 0;
        for (int i : a) {
            if(i == ele) cnt++;
        }
        if(cnt > a.length/2) return ele;
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,3,3,2};
        System.out.println(majorEle(arr, arr.length));
    }
}
