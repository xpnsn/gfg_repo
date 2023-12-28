class Pair {
    long first, second;
    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

public class minmax {
    
    static Pair getMinMax(long a[], long n) {

        long max = a[0];
        long min = a[0];

        for(int i=0; i<n-1; i++) {
            if(min > a[i+1]) {
                min = a[i+1];
            }
            if(max < a[i+1]) {
                max = a[i+1];
            }
        }

        Pair pair = new Pair(min, max);

        return pair;
    }

    public static void main(String[] args) {
        long a[] = {3,2,1,56,10000,167};
        System.out.println(getMinMax(a, a.length));
    }
}
