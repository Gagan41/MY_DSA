package Array;

public class LC997 {
    public int findJudge(int n, int[][] trust) {
        int[] inD = new int[n+1];
        int[] outD = new int[n+1];

        for(int[] t:trust){
            int a = t[0];
            int b = t[1];

            outD[a]++;
            inD[b]++;
        }

        for(int p=1; p<=n; p++){
            if(inD[p] == n-1 && outD[p] == 0){
                return p;
            }
        }

        return -1;
    }
}
