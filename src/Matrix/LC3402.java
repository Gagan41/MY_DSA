package Matrix;

public class LC3402 {
    static int minimumOperations(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int op = 0;

        for(int i=0; i<n; i++){
            for(int j=1; j<m; j++){
                if(grid[j][i] <= grid[j-1][i]){
                    int req = grid[j-1][i] + 1;
                    op += req - grid[j][i];
                    grid[j][i] = req;
                }
            }
        }
        return op;
    }

    public static void main(String[] args) {
        int[][] grid = {{3,2}, {1,3}, {3,4},{0,1}};
        System.out.println(minimumOperations(grid));
    }
}
