package Matrix;
import java.util.Arrays;

public class LC3643 {
    static int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int top = x;
        int bot = x + k - 1;

        while (top < bot) {
            for (int col = y; col < y + k; col++) {
                int temp = grid[top][col];
                grid[top][col] = grid[bot][col];
                grid[bot][col] = temp;
            }
            top++;
            bot--;
        }

        return grid;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int x = 1, y = 0, k = 3;

        int[][] result = reverseSubmatrix(grid, x, y, k);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}