package Matrix;
import java.util.*;

public class LC1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int tot = m * n;

        k %= tot;

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<m; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j <n; j++){
                row.add(0);
            }
            res.add(row);
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int oInd = i * n + j;
                int nInd = (oInd + k) % tot;

                int nRow = nInd / n;
                int nCol = nInd % n;

                res.get(nRow).set(nCol, grid[i][j]);
            }
        }

        return res;
    }
}
