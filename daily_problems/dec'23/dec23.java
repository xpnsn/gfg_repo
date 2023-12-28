//incorect solution
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class dec23 {
    
    static int countOccurence(int[] arr, int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int ele : arr) {
            list.add(ele);
        }
        Collections.sort(list);
        int count = 0;
        int cnt = 1;

        for(int i=1; i<n; i++) {
            if(list.get(i) == list.get(i-1)) {
                cnt++;
            } else {
                if(cnt > n/k) {
                    count++;
                }
                cnt = 1;
            }
        }
        if(cnt > n/k) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String input;
        int n, k;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            k = sc.nextInt();
            input = sc.nextLine();
        }
        int arr[] = new int[n];
        StringTokenizer ss = new StringTokenizer(input, " ");
        String st;
        int x = 0;
        while(ss.hasMoreTokens()) {
            st = ss.nextToken();

            arr[x++] = Integer.parseInt(st);
            System.out.println(st);
        }
        System.out.println(countOccurence(arr, arr.length, k));
    }
}
