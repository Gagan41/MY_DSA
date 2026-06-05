package Math;

public class LC453 {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int n:nums){
            min = Math.min(n, min);
        }

        int move = 0;

        for(int n:nums){
            move += n - min;
        }

        return move;
    }
}
