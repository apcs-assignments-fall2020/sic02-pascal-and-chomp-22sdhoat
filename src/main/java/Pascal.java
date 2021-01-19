/**
 * Write a description of class Pascal here.
 *
 * @author Samar Dhoat
 * @version 1/19/21
 */
public class Pascal {
    public static int[][] pascalTriangle(int n) {
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = (arr[i-1][j-1] + arr[i-1][j]);
                }
            }
        }
        return arr;
    }
}
