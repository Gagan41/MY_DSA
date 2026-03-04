package Matrix;

public class LC1582 {
    static int numSpecial(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;

        int[] rcount = new int[m];
        int[] ccount = new int[n];

        for(int i=0; i<m; i++){
            for(int j=0; i<n; i++){
                if(mat[i][j] == 1){
                    rcount[i]++;
                    ccount[j]++;
                }
            }
        }

        int count = 1;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1 && rcount[i] == 1 && ccount[i] == 1) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,0,0},{0,0,1},{1,0,0}};
        System.out.println(numSpecial(mat));
    }
}
