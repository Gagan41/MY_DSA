package DP;

public class LC221 {
    static int maximalSquare(char[][] matrix){
        int m = matrix.length, n = matrix[0].length;
        int[] dp = new int[n];
        int prev = 0, maxside = 0;

        for(int i=0; i<m; i++){
            prev = 0;
            for(int j=0; j<n; j++){
                int temp = dp[j];

                if(matrix[i][j] == '1'){
                    if(j == 0) dp[j] = 1;
                    else dp[j] = 1 + Math.min(dp[j], Math.min(dp[j-1],prev));

                    maxside = Math.max(maxside, dp[j]);
                } else {
                    dp[j] = 0;
                }

                prev = temp;
            }
        }

        return maxside * maxside;
    }

    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalSquare(matrix));
    }
}
