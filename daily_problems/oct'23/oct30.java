public class oct30 {
    
    static long sumXOR(int arr[], int n) {
        long[] b = new long[32];
        long ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<32;j++)
            {
                if((arr[i]&(1<<j))>0)
                {
                    ans+=(1<<j)*(i-b[j]);
                    b[j]++;
                }
                else
                {
                    ans+=(1<<j)*(b[j]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        System.out.println(sumXOR(a, 4));
    }
}
