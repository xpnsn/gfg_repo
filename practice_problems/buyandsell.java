import java.util.ArrayList;
import java.util.Arrays;

public class buyandsell {
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer> > ar=new ArrayList<ArrayList<Integer> >();
        for(int i=0;i<n-1;i++)
        {
            if(A[i]<A[i+1])
             ar.add(new ArrayList<Integer>(Arrays.asList(i,i+1)));
        }
        return ar;
    }

    public static void main(String[] args) {
        int A[] = {20, 10, 50, 40, 20, 10, 100};
        buyandsell obj = new buyandsell();
        System.out.println(obj.stockBuySell(A, A.length));
    }
}
