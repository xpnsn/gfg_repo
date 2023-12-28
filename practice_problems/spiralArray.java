import java.util.ArrayList;

public class spiralArray {

    static ArrayList<Integer> spiralTransvers(int matrix[][], int r, int c) {

        ArrayList<Integer> spiral = new ArrayList<>();
        int sr = 0, sc = 0, er = r - 1, ec = c - 1;
        int x = 0, y = 0;
        int ele;

        for (int i = 0; i < r / 2 + 1; i++) {
            while (x <= ec) {
                ele = matrix[sr][x++];
                spiral.add(ele);
                y++;
                if (y == r * c) {
                    return spiral;
                }
            }
            sr++;
            x = sr;
            while (x <= er) {
                ele = matrix[x++][ec];
                spiral.add(ele);
                y++;
                if (y == r * c) {
                    return spiral;
                }
            }
            ec--;
            x = ec;
            while (x >= sc) {
                ele = matrix[er][x--];
                spiral.add(ele);
                y++;
                if (y == r * c) {
                    return spiral;
                }
            }
            er--;
            x = er;
            while (x >= sr) {
                ele = matrix[x--][sc];
                spiral.add(ele);
                y++;
                if (y == r * c) {
                    return spiral;
                }
            }
            sc++;
            x = sc;
        }
        return spiral;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 },
                { 19, 20, 21, 22, 23, 24 }
        };
        System.out.println(spiralTransvers(matrix, 4, 6));
    }
}
