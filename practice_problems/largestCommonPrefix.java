public class largestCommonPrefix {
    
    static String longestCommonPrefix(String arr[], int n) {
        String prefixStr = arr[0];
        int idx = 0;

        for(String str : arr) {
            for(int i=0; i<Math.min(prefixStr.length(), str.length()); i++) {
                if(prefixStr.charAt(i) == str.charAt(i)) {
                    idx++;
                } else {
                    break;
                }
            }
            if(idx == 0) return "-1";
            else {
                prefixStr = prefixStr.substring(0, idx);
                idx = 0;
            }
        }
        return prefixStr;
    }

    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geekbits", "geeks", "geezer"};

        System.out.println(longestCommonPrefix(arr, arr.length));
    }
}
