package Design;

public class LC2682 {
    static int[] circularGameLosers(int n, int k){
        var map = new boolean[n];
        int x = 0, i;

        for(i=1; !map[x]; i++){
            map[x] = true;
            x = (x + i * k) % n;
        }

        var ans = new int[n-i+1];
        var j = 0;

        for(i=0; i<n; i++){
            if(!map[i]){
                ans[j++] = i+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 5, k = 2;
        int[] res = circularGameLosers(n,k);

        for(int r:res){
            System.out.print(r + " ");
        }
    }
}
